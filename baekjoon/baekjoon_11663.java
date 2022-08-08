import java.io.*;
import java.util.*;

public class baekjoon_11663 {
        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());

        int[] points = new int[N];
        int[][] lines = new int[M][3]; // 0,1:선분의 시작점과 끝점, 2:선분에 포함된 점의 개수

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(points);

        for(int i = 0; i < M; i++) {

            int lo = 0;
            int hi = N-1;

            int x = lines[i][0]; // 이분탐색 대상

            // 이분탐색
            while(lo <= hi) {

                int mid = (hi + lo) / 2;
                    
                // 부등호 중요..!
                if(points[mid] >= x) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            
            int start = lo;

            lo = 0;
            hi = N-1;
            
            x = lines[i][1]; // 이분탐색 대상

            // 이분탐색
            while(lo <= hi) {

                int mid = (hi + lo) / 2;
                    
                if(points[mid] > x) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            int end = hi;

            // System.out.println("0:" +  + " 1:" + );
            lines[i][2] = end - start + 1;
            sb.append(lines[i][2]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}