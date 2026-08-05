# 42 - Trapping Rain Water
**Link:** https://leetcode.com/problems/trapping-rain-water/ | **Difficulty:** Hard | **Language:** Java

Given elevation heights, compute how much rain water is trapped between the
bars after it rains.

**Idea:** two pointers from both ends. The water trapped above a bar is
bounded by the *smaller* of the tallest bar to its left and tallest to its
right. Move whichever pointer currently has the smaller max-so-far inward,
since that side's water level is already determined — you never need to look
at the other side's exact max, only that it's `>=` the current side's max.

**Complexity:** O(n) time, O(1) space — beats the prefix/suffix-array
approach's O(n) space.
