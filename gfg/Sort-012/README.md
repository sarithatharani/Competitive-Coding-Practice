# Sort an Array of 0s, 1s, and 2s
**Search:** "Sort 0 1 2 Dutch National Flag GFG" | **Difficulty:** Medium | **Language:** Java

Sort an array containing only 0s, 1s, and 2s in a single pass, in-place.

**Idea:** Dutch National Flag algorithm — three pointers `low`, `mid`,
`high`. `arr[mid]==0` swaps it to the `low` region and advances both `low`
and `mid`; `arr[mid]==1` just advances `mid` (already in place); `arr[mid]==2`
swaps it to the `high` region and shrinks `high`, but `mid` stays put since
the swapped-in value hasn't been checked yet.

**Complexity:** O(n) time, O(1) space, single pass.
