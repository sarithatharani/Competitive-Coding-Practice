# Move All Zeroes to End of Array
**Search:** "Move all zeroes to end of array GFG" | **Difficulty:** Easy | **Language:** Java

Rearrange the array in-place so all zeroes move to the end, preserving the
relative order of non-zero elements.

**Idea:** maintain an `insertPos` pointer. Scan left to right, and whenever a
non-zero value is found, place it at `arr[insertPos]` and advance the
pointer. After the scan, fill everything from `insertPos` to the end with 0.

**Complexity:** O(n) time, O(1) extra space (in-place).
