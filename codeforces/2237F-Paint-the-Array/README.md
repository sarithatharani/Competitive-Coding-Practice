# 2237F - Paint the Array

**Contest:** Codeforces Round 1104 (Div. 1 + Div. 2)
**Link:** https://codeforces.com/contest/2237/problem/F
**Verdict:** Accepted
**Language:** Java

## Problem (short version)

You're given an array `a` of length `n`, values `1..m`.

A **painting operation** picks a starting index `l` and paints the length-`m`
window `[l, l+m-1]` with the values `1, 2, ..., m` left to right. If a
position gets painted more than once, only the most recent paint counts.

An array is **valid** if it can be produced by some sequence of these
operations such that every position is painted at least once.

Given `a`, find the minimum number of single-element modifications needed to
make it valid.

## Core idea

**Step 1 — every position "wants" one specific operation.**

If position `i` (0-indexed) were painted by an operation starting at `l`,
its value would be `i - l + 1`. So if we want `a[i]` to survive untouched,
it must be the *last* operation covering `i` to have started at exactly:

```
x = i - (a[i] - 1)      // start of the window this value implies
y = x + m - 1            // end of that window  =  i + (m - a[i])
```

This window is only usable if it fits inside the array (`x >= 0`, `y < n`).
That's exactly the `x`/`y` computed in the code for every index `i`.

**Step 2 — this becomes a "pick the largest compatible set of windows" problem.**

We don't have to keep every position — we're allowed to modify some of
them. So the task reduces to: choose as many of these candidate windows as
possible (one per kept position, but multiple kept positions can share the
*same* window) such that they can be applied in some order (increasing start
position works) without a later window overwriting an earlier window's kept
position with the wrong value. Positions we don't keep just get "sacrificed"
as a modification, and any leftover gaps in the array can always be covered
by extra (non-matching) paint operations for free, since coverage alone
never costs a modification.

Maximizing the number of positions we can keep is therefore a **longest
compatible chain of intervals** problem — the same flavor as weighted
interval scheduling, except every interval has the same length `m`.

```
answer = n - (largest number of positions we can keep)
```

**Step 3 — computing the chain length in O(n), without a segment tree.**

Instead of a Fenwick/segment tree over positions, the code keeps three plain
arrays plus one running variable, all updated as `i` increases:

| Variable | Meaning |
|---|---|
| `L[x]`   | best chain length achievable using a window that **starts** at position `x` |
| `R[y]`   | best chain length achievable using a window that **ends** at position `y` |
| `LL[i]`  | running prefix-max of `L[0..i-1]` — "best chain using any window starting before `i`" |
| `tma`    | running max of `R[0..i-1]` — "best chain using any window that has already ended by `i`" |

For each `i`, if its window `[x, y]` fits in the array:

```java
cur = max(L[x], tma, LL[x]) + 1;
R[y] = max(R[y], cur);
L[x] = max(L[x], cur);
LL[i+1] = max(LL[i+1], cur);
```

`cur` is "the best chain we can extend by adding this window" — it looks at
the best chain that already finished before this window starts (`tma`), or
that starts at/around the same `x` (`L[x]`, `LL[x]`), and adds 1 for the
current window. The result is written back into `L`, `R`, and the running
prefix `LL` so later positions can build on top of it. `tma` and `ans` are
then updated as we sweep `i` left to right.

At the end, `ans` = the longest achievable chain, and the answer per test
case is `n - ans`.

## Complexity

- Time: `O(n)` per test case (single left-to-right sweep, all array lookups
  are O(1)).
- Space: `O(n)` for the three auxiliary arrays.
