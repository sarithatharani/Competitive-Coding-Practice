import java.util.Scanner;

public class CF466C_NumberOfWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] prefix = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + sc.nextLong();
        }

        long total = prefix[n];
        if (total % 3 != 0) {
            System.out.println(0);
            return;
        }
        long target = total / 3;

        long countTargetSoFar = 0;
        long ans = 0;

        // k ranges over possible split points (1..n-1); part3 must be non-empty
        // so k (end of part2) can be at most n-1, and i (end of part1) at least 1.
        for (int k = 1; k <= n - 1; k++) {
            if (prefix[k] == 2 * target) {
                ans += countTargetSoFar;
            }
            if (prefix[k] == target) {
                countTargetSoFar++;
            }
        }

        System.out.println(ans);
    }
}
