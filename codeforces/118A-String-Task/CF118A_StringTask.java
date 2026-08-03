import java.util.Scanner;

public class CF118A_StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().toLowerCase();

        String vowels = "aoyeui";
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append('.');
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
