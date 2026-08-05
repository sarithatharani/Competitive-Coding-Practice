# Kadane's Algorithm (Maximum Subarray Sum)
**Link:** https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1 | **Difficulty:** Medium | **Language:** Java

Find the maximum sum of a contiguous subarray.

**Idea:** same as LeetCode 53 — at each index decide whether extending the
current run is still worth it or whether starting fresh at this element beats
it: `currentSum = max(arr[i], currentSum + arr[i])`. Track the best value
seen.

**Complexity:** O(n) time, O(1) space.
