# 1195C - Basketball Exercise
**Link:** https://codeforces.com/problemset/problem/1195/C | **Rating:** 1400 | **Language:** Java

Two rows of n students each. Pick a subsequence of columns (left to right),
choosing one student per chosen column from either row, such that no two
consecutively-chosen students come from the same row. Maximize total height.

**Idea:** DP over columns. `dp0[i]` = best total ending at column i picking
row 1, `dp1[i]` = best total ending at column i picking row 2. Since the only
constraint is "not the same row as the previous pick" (no index-adjacency or
height-ordering constraint), each `dp0[i]`/`dp1[i]` only needs the *running
max* of the other row's dp values seen so far — not a full comparison against
every earlier index. That collapses an apparent O(n²) DP into O(n).

**Complexity:** O(n) time, O(1) extra space (beyond the two running maxes).
