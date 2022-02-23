import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_1010 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException{
        
        for(int i = 0; i < 30; i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for(int i = 2; i < 30; i++){
            for(int j = 1; j < 30; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            result.append(dp[M][N]).append('\n');
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}
