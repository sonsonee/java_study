import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_25304 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        long X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        long total = 0;

        for(int i = 0; i < N; i++) {
        
            st = new StringTokenizer(br.readLine());

            int price = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());

            total += (price * quantity);
        }

        if(X == total) System.out.println("Yes");
        else System.out.println("No");
    }
}