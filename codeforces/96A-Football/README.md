# 96A - Football
**Link:** https://codeforces.com/problemset/problem/96/A | **Rating:** 900 | **Language:** Java

Given a binary string, decide whether some team "scored 7 goals in a row" —
i.e. whether there are 7 or more consecutive equal characters.

**Idea:** single pass tracking the length of the current run of equal
characters; reset the run to 1 whenever the character changes; report YES as
soon as the run reaches 7.

**Complexity:** O(n) time, O(1) extra space.
