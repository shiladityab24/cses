import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        final int N = 109;

        for (int tc = 0; tc < t; ++tc) {
            int n = scanner.nextInt();
            int[] s = new int[N];
            int[] e = new int[N];

            for (int i = 0; i < n; ++i) {
                s[i] = scanner.nextInt();
                e[i] = scanner.nextInt();
            }

            boolean ok = true;
            for (int i = 1; i < n; ++i) {
                if (s[i] >= s[0] && e[i] >= e[0]) {
                    ok = false;
                    break;
                }
            }

            if (!ok) {
                System.out.println("-1");
                continue;
            }

            System.out.println(s[0]);
        }
    }
}
