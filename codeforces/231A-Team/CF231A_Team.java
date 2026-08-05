import java.util.Scanner;

public class CF231A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solvable = 0;
        for (int i = 0; i < n; i++) {
            int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
            if (sum >= 2) solvable++;
        }
        System.out.println(solvable);
    }
}
