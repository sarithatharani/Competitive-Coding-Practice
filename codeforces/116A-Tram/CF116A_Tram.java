import java.util.Scanner;

public class CF116A_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        int current = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            int leaving = Integer.parseInt(parts[0]);
            int entering = Integer.parseInt(parts[1]);

            current -= leaving;   // passengers exit first
            current += entering;  // then passengers enter

            maxCapacity = Math.max(maxCapacity, current);
        }

        System.out.println(maxCapacity);
    }
}
