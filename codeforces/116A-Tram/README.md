# 116A - Tram

**Contest:** Codeforces Beginner Problems
**Link:** https://codeforces.com/problemset/problem/116/A
**Verdict:** Accepted
**Language:** Java
**Rating:** 1000

## Problem (short version)

A tram has `n` stops. At stop `i`, `a_i` passengers exit and then `b_i`
passengers enter. Find the minimum number of seats the tram needs — i.e.
the maximum number of passengers on board at any point during the route.

## Core idea

Simulate the ride stop by stop, tracking the current passenger count:

1. At each stop, subtract the number leaving (`a_i`) — they exit **before**
   anyone new boards.
2. Add the number entering (`b_i`).
3. After each stop, update a running maximum.

The tram starts empty, so no special initialization is needed beyond
`current = 0`. The answer is simply the largest value `current` ever
reaches.

```java
current -= leaving;
current += entering;
maxCapacity = Math.max(maxCapacity, current);
```

## Complexity

- Time: `O(n)` — single pass over the stops.
- Space: `O(1)` — only running counters are kept.
