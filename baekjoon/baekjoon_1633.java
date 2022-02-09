package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_1633 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] white;
    static int[] black;
    static int[][][] dp;
    static int index = 0;
    public static void main(String[] args) throws IOException{

        white = new int[1001];
        black = new int[1001];
        // dp[i][w][b] : i번째 index에서 백팀이 w명, 흑팀이 b명 뽑혔을 때의 합
        dp = new int[1001][16][16];

        String line;
		while((line = br.readLine()) != null){
            st = new StringTokenizer(line);
            white[index] = Integer.parseInt(st.nextToken());
            black[index] = Integer.parseInt(st.nextToken());
            index++; 
        }
        

        for(int i = 0; i < index; i++){
            for(int w = 0; w <= 15; w++){
                for(int b = 0; b <= 15; b++){
                    if(w+1 < 16){
                        dp[i+1][w+1][b] = Math.max(dp[i+1][w+1][b], dp[i][w][b] + white[i]);
                    }
                    if(b+1 < 16){
                        dp[i+1][w][b+1] = Math.max(dp[i+1][w][b+1], dp[i][w][b] + black[i]);
                    }
                    dp[i+1][w][b] = Math.max(dp[i][w][b], dp[i+1][w][b]);
               }
            }
        }

        System.out.print(dp[index][15][15]);
    }
}
