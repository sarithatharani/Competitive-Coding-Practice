# 238 - Product of Array Except Self
**Link:** https://leetcode.com/problems/product-of-array-except-self/ | **Difficulty:** Medium | **Language:** Java

Return an array where each element is the product of all other elements,
without using division.

**Idea:** two passes. First pass fills `answer[i]` with the product of
everything to the left of `i` (prefix product). Second pass, going right to
left, multiplies in the product of everything to the right (suffix product)
using a single running variable instead of a second array.

**Complexity:** O(n) time, O(1) extra space (output array doesn't count).
