import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2775 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static int[][] d = new int[15][15];

    public static void main(String[] args) throws IOException {

        for(int i = 1; i <= 14; i++) {
            d[0][i] = i;
        }

        for(int i = 1; i <= 14; i++) {
            d[i][1] = 1;
        }

        for(int i = 1; i <= 14; i++) {
            for(int j = 2; j <= 14; j++) {
                d[i][j] = d[i-1][j] + d[i][j-1];
            }
        }

        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());  //층
            int n = Integer.parseInt(br.readLine());  //호

            answer.append(d[k][n]).append("\n");
        }

        System.out.println(answer.toString());
    }

}