import java.util.Scanner;

public class baekjoon_11726 {

    static int d[];
    
    public static void main(String[] args) {
    
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            d = new int[1001];
            d[0] = 1;
            d[1] = 1;
            
            System.out.print(dp(n));
        }
    }

    static int dp(int n) {
        if(d[n] != 0) return d[n];
        else {
            d[n] = dp(n-1) + dp(n-2);
            return d[n] % 10007;
        }
    }
}
