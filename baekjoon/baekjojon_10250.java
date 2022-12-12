import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjojon_10250 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int YY = N % H;
            int XX = N / H + 1;
            if(YY == 0) {
                YY = H;
                XX = N / H;
            }

            System.out.printf("%d%02d\n", YY, XX);
        }
    }
}