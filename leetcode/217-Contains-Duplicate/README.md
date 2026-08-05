# 217 - Contains Duplicate
**Link:** https://leetcode.com/problems/contains-duplicate/ | **Difficulty:** Easy | **Language:** Java

Return true if any value appears at least twice.

**Idea:** insert into a HashSet one element at a time; `Set.add` returns
`false` if the element was already present, which doubles as the duplicate
check.

**Complexity:** O(n) time, O(n) space.
