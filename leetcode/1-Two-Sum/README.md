# 1 - Two Sum
**Link:** https://leetcode.com/problems/two-sum/ | **Difficulty:** Easy | **Language:** Java

Find indices of two numbers in an array that add up to a target.

**Idea:** hashmap of value → index. For each number, check whether its
complement (`target - num`) was already seen; if so, return the two indices.
One pass, no nested loop.

**Complexity:** O(n) time, O(n) space.
