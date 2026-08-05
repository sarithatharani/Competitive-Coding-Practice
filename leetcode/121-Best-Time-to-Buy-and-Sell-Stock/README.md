# 121 - Best Time to Buy and Sell Stock
**Link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ | **Difficulty:** Easy | **Language:** Java

One transaction (one buy, one sell) — maximize profit.

**Idea:** track the minimum price seen so far while scanning left to right;
at each day, the best possible profit if selling today is `price - minSoFar`.
Keep a running max of that.

**Complexity:** O(n) time, O(1) space.
