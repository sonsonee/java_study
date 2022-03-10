import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11048 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] maze = new int[N+1][M+1];
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= M; j++){
                maze[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] d = new int[N+1][M+1];
        d[1][1] = maze[1][1];
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= M; j++){
                d[i][j] = Math.max(Math.max(d[i-1][j], d[i][j-1]), d[i-1][j-1]) + maze[i][j];
            }
        }

        System.out.println(d[N][M]);
    }

}
