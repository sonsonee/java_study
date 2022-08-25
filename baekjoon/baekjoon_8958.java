import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_8958 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];

        for(int i = 0; i < N; i++) {
            
            st = new StringTokenizer(br.readLine(), "X");

            while(st.hasMoreTokens()) {
                String s = st.nextToken();
                int l = s.length();
                scores[i] += (l*(l+1))/2;
            }
        }

        for(int s : scores) {
            System.out.println(s);
        }

    }
}