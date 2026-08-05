# 231A - Team
**Link:** https://codeforces.com/problemset/problem/231/A | **Rating:** 800 | **Language:** Java

Three teammates vote yes/no on n problems. A problem gets solved if at least
2 of the 3 agree it's solvable.

**Idea:** for each problem sum the three 0/1 votes; if the sum is `>= 2`,
count it.

**Complexity:** O(n) time, O(1) extra space.
