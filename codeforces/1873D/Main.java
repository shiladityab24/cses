import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
        for (int i = 1; i <= tt; i++) {
            solve(scanner);
        }
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'B') {
                res++;
                i += k - 1;
            }
        }
        System.out.println(res);
    }
}
