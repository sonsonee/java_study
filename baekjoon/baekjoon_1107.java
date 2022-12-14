import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_1107 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        boolean[] broken = new boolean[10];

        if(M > 0) {
            int[] numbers = new int[M];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
    
            // 고장 여부를 저장
            for(int i = 0; i < M; i++) {
                broken[numbers[i]] = true;
            }    
        }

        br.close();

        int answer = Math.abs(N - 100);
        for(int i = 0; i <= 999999; i++) {

            String tmp = String.valueOf(i);
            boolean possible = true;
            for(int j = 0; j < tmp.length(); j++) {
                if(broken[tmp.charAt(j)-'0']) {
                    possible = false;
                    break;
                }
            }

            if(possible) {
                answer = Math.min(answer, tmp.length() + Math.abs(N - i));
            }
        }
        
        System.out.println(answer);
    }
}