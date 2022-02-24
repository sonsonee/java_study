import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1018 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] input = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                if(s.charAt(j) == 'W')
                    input[i][j] = true;
            }
        }

        br.close();

        int min = 32;

        for(int i = 0; i < N - 7; i++){
            for(int j = 0; j < M - 7; j++){
                int count = 0;
                boolean b = input[i][j];
                for(int k = i; k < i + 8; k++){
                    for(int l = j; l < j + 8; l++){
                        if(input[k][l] != b){
                            count++;
                        }
                        b = !b;
                    }
                    b = !b;
                }
                count = Math.min(count, 64-count);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);
    }
}
