import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
            }
            long mnA = Arrays.stream(a).min().getAsLong();
            long sA = Arrays.stream(a).sum();
            long mnB = Arrays.stream(b).min().getAsLong();
            long sB = Arrays.stream(b).sum();
            long ans = Math.min(mnA * n + sB, mnB * n + sA);
            System.out.println(ans);
        }
    }
}