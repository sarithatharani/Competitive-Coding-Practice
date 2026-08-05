# 1352D - Alice, Bob and Candies
**Link:** https://codeforces.com/problemset/problem/1352/D | **Rating:** 1300 | **Language:** Java

Alice eats from the left, Bob from the right, alternating turns. On a turn,
a player eats candies one at a time from their side until the **sum eaten
this move** exceeds the sum the other player ate on their *previous* move.
Report total moves and each player's total consumption.

**Idea:** two pointers (`left`, `right`) sweeping inward. Track only
`prevMoveSum` — the size of the last move made by the *other* player — and
accumulate the current move until it exceeds that value (or candies run
out). This is a common trap: it's easy to mistakenly compare against
cumulative totals instead of just the opponent's last move.

**Complexity:** O(n) time per test case, O(1) extra space (besides input).
