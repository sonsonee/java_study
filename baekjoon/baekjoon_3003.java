import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_3003 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int[] standard = {1, 1, 2, 2, 2, 8};

        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < 6; i++) {
            int n = Integer.parseInt(st.nextToken());
            System.out.print((standard[i] - n) + " ");
        }
    }

}