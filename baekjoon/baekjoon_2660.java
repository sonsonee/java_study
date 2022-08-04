import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon_2660 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb;
    static int[][] d;
    final static int INF = 147483647;

    public static void main(String[] args) throws IOException{
        
        int n = Integer.parseInt(br.readLine());

        d = new int[n+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i != j) d[i][j] = INF;
            }
        }

        String inputString;
        while(!(inputString = br.readLine()).equals("-1 -1")) { // -1 -1 전까지 반복
            st = new StringTokenizer(inputString);

            int m1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());

            d[m1][m2] = d[m2][m1] = 1;
        }

        br.close();

        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    if(d[i][j] > d[i][k] + d[k][j]) { // i에서 j로 가는 비용과 i에서 k를 거쳐 j로 가는 비용을 비교
                        d[i][j] = d[i][k] + d[k][j]; // 더 작은 값으로 교체
                    }
                }
            }
        }

        int[] scores = new int[n+1]; // 점수
        int min = INF; // 최저점수
        for(int i = 1; i <= n; i++) {
            int score = 0;
            for(int j = 1; j <= n; j++) {
                if(d[i][j] != INF) {
                    score = Math.max(d[i][j], score);
                }
            }

            scores[i] = score;
            min = Math.min(min, score);
        }

        int num = 0; // 후보수
        List<Integer> can = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(scores[i] == min) {
                num++;
                can.add(i);
            }
        }

        sb = new StringBuilder();

        sb.append(min + " " + num).append("\n");
        Iterator<Integer> it = can.iterator();
        while(it.hasNext()) sb.append(it.next() + " ");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
