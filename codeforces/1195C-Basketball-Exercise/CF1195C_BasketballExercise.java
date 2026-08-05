import java.util.Scanner;

public class CF1195C_BasketballExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        for (int i = 0; i < n; i++) b[i] = sc.nextLong();

        // dp0[i] = best total ending at column i, last pick from row 1
        // dp1[i] = best total ending at column i, last pick from row 2
        // bestBefore0/1 = running max of dp0/dp1 over all columns < i
        long bestBefore0 = 0, bestBefore1 = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            long dp0 = a[i] + bestBefore1;
            long dp1 = b[i] + bestBefore0;

            bestBefore0 = Math.max(bestBefore0, dp0);
            bestBefore1 = Math.max(bestBefore1, dp1);

            ans = Math.max(ans, Math.max(dp0, dp1));
        }

        System.out.println(ans);
    }
}
