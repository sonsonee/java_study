import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_4948 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static int MAX = 123456 * 2;

    public static void main(String[] args) throws IOException {
        
        boolean[] prime = new boolean[MAX+1];
        
        for(int i = 0; i <= MAX; i++) {prime[i] = true;}
        prime[0] = prime[1] = false;

        for(int i = 2; i <= MAX; i++) {
            if(prime[i]) {
                for(int j = 2*i; j <= MAX; j += i) {
                    prime[j] = false;
                }
            }
        }

        String s;
        while(true) {
            s = br.readLine();
            if(s.equals("0")) break;

            int n = Integer.parseInt(s);
            int m = 0; //개수
            for(int i = n+1; i <= 2*n; i++) {
                if(prime[i]) m++;
            }
            answer.append(m).append("\n");
        }
        
        System.out.println(answer.toString());
    }
}