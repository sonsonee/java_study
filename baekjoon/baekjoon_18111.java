import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_18111 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        int min = 256;
        int max = 0;
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        br.close();

        long[] answer = {Integer.MAX_VALUE, 0};
        for(int i = min; i < max + 1; i++) {

            // map 전체를 계산
            long sum = 0;
            int remain = B;
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < M; k++) {
                    int gap = i - map[j][k];    // 목표치와 실제 높이의 차이
                    if(gap == 0) continue;
                    else if(gap < 0) {          // 블럭 제거
                        remain += Math.abs(gap);
                        sum += Math.abs(gap)*2;
                    } else {                    // 블럭 쌓기
                        remain -= gap;
                        sum += gap;
                    }
                }
            }

             // 높이를 저장해야 하므로 answer[0] == sum도 포함
           if(remain >= 0 && answer[0] >= sum) {
                answer[0] = sum;
                answer[1] = i;
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}