import java.util.Scanner;

public class baekjoon_11050 {

    static int[][] dp = new int[11][11];
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();

            for(int i = 0; i < 11; i++){
                dp[i][i] = 1;
                dp[i][0] = 1;
            }

            for(int i = 2; i < 11; i++){
                for(int j = 1; j < 11; j++){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }

            System.out.println(dp[N][K]);
        }
    }
}
