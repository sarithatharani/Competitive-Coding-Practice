# 158A - Next Round
**Link:** https://codeforces.com/problemset/problem/158/A | **Rating:** 800 | **Language:** Java

Given n scores in non-increasing order and a cutoff position k, count how many
participants score more than 0 **and** at least as much as the k-th participant.

**Idea:** the k-th score is the threshold. Scan the array once, count entries
that are `> 0` and `>= threshold`.

**Complexity:** O(n) time, O(1) extra space.
