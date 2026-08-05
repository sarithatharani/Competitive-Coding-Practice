# 53 - Maximum Subarray
**Link:** https://leetcode.com/problems/maximum-subarray/ | **Difficulty:** Medium | **Language:** Java

Find the contiguous subarray with the largest sum.

**Idea:** Kadane's algorithm. At each element, decide whether to extend the
current subarray or start fresh: `currentSum = max(nums[i], currentSum +
nums[i])`. Track the best `currentSum` ever seen.

**Complexity:** O(n) time, O(1) space.
