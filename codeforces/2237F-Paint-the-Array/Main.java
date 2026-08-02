import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int T = fs.nextInt();

        while (T-- > 0) {

            int n = fs.nextInt();
            int m = fs.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            int[] L = new int[n + 5];
            int[] LL = new int[n + 5];
            int[] R = new int[n + 5];

            int tma = 0;
            int ans = 0;

            for (int i = 0; i < n; i++) {

                int x = i - (a[i] - 1);
                int y = i + (m - a[i]);

                if (x >= 0 && y < n) {

                    int cur = Math.max(
                            Math.max(L[x], tma),
                            LL[x]
                    ) + 1;

                    R[y] = Math.max(R[y], cur);
                    L[x] = Math.max(L[x], cur);
                    LL[i + 1] = Math.max(LL[i + 1], cur);
                }

                LL[i + 1] = Math.max(LL[i + 1], LL[i]);

                tma = Math.max(tma, R[i]);

                ans = Math.max(ans, tma);
            }

            out.append(n - ans).append('\n');
        }

        System.out.print(out);
    }
}
