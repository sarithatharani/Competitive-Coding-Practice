# Second Largest Element in an Array
**Search:** "Second Largest Element GFG" | **Difficulty:** Easy | **Language:** Java

Return the second largest **distinct** value in the array (or -1 if it
doesn't exist).

**Idea:** track `first` and `second` in one pass. If the current element beats
`first`, the old `first` becomes the new `second` and the element becomes the
new `first`. Otherwise, if it beats `second` but is strictly less than
`first` (to skip duplicates of the max), update `second`.

**Complexity:** O(n) time, O(1) space.
