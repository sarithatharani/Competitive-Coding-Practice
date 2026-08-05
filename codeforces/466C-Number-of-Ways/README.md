# 466C - Number of Ways
**Link:** https://codeforces.com/problemset/problem/466/C | **Rating:** 1700 | **Language:** Java

Count the number of ways to split an array into 3 contiguous non-empty parts
with equal sums.

**Idea:** if the total sum isn't divisible by 3, the answer is 0. Otherwise
let `target = total / 3`. Build prefix sums, then scan once: for every split
point `k` where `prefix[k] == 2*target` (a valid end for part 2), add the
running count of earlier points where `prefix[i] == target` (valid ends for
part 1). Doing the "check as part-2 boundary" before "register as part-1
boundary" at the same index keeps the strict `i < k` ordering correct.

**Complexity:** O(n) time, O(n) space for the prefix array.
