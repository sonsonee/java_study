import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2581 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        prime = new boolean[N+1];
        for(int i = 0; i <= N; i++) prime[i] = true;
        prime[0] = prime[1] = false;

        for(int i = 2; i <= N; i++) {
            if(prime[i] == true) {
                for(int j = i * i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }

        int sum = 0;
        int min = 0;
        for(int i = M; i <= N; i++) {
            if(prime[i] == true) {
                if(sum == 0) min = i;
                sum += i;
            }
        }

        if(sum == 0) System.out.print(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}