import java.util.Scanner;

public class CF96A_Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int streak = 1;
        boolean found = false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                streak++;
            } else {
                streak = 1;
            }
            if (streak >= 7) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}
