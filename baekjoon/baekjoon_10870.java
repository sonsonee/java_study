import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10870 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] d = new int[21];

    public static void main(String[] args) throws IOException {
        
        for(int i = 0; i <= 20; i++) {
            d[i] = -1;
        }

        d[0] = 0;
        d[1] = 1;

        int n = Integer.parseInt(br.readLine());
    
        if(n <= 1) {
            System.out.println(d[n]);
        } else {
            System.out.println(F(n));
        }
    }

    static int F(int n) {
        if(d[n-2] == -1) d[n-2] = F(n-2);
        if(d[n-1] == -1) d[n-1] = F(n-1);
        return d[n-2] + d[n-1];
    }
}