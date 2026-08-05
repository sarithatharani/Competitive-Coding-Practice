# Trapping Rain Water
**Search:** "Trapping Rain Water GFG" | **Difficulty:** Hard | **Language:** Java

Same problem as LeetCode 42 — compute total trapped rainwater given an
elevation array.

**Idea:** identical two-pointer approach — move the side with the smaller
running max inward, since that side's trapped water is already fully
determined by its own max regardless of what's on the other side.

**Complexity:** O(n) time, O(1) space.
