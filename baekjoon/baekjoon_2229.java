import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2229 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        int[] d = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            int max = 0, min = 10001;
            for(int j = i; j > 0; j--) {
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                d[i] = Math.max(d[i], max - min + d[j-1]);
            }
        }

        System.out.println(d[N]);    
        br.close();    
    }

}