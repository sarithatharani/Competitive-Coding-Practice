import java.util.*;

public class CF1352D_AliceBobCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            int left = 0, right = n - 1;
            long prevMoveSum = 0;   // size eaten by the OTHER player on their last move
            long aliceTotal = 0, bobTotal = 0;
            int moves = 0;
            boolean aliceTurn = true;

            while (left <= right) {
                long curSum = 0;
                if (aliceTurn) {
                    while (left <= right && curSum <= prevMoveSum) {
                        curSum += a[left];
                        left++;
                    }
                    aliceTotal += curSum;
                } else {
                    while (left <= right && curSum <= prevMoveSum) {
                        curSum += a[right];
                        right--;
                    }
                    bobTotal += curSum;
                }
                prevMoveSum = curSum;
                moves++;
                aliceTurn = !aliceTurn;
            }

            sb.append(moves).append(" ").append(aliceTotal).append(" ").append(bobTotal).append("\n");
        }
        System.out.print(sb);
    }
}
