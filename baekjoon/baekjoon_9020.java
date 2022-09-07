import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon_9020 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static int MAX = 10000;

    public static void main(String[] args) throws IOException {
        
        boolean[] prime = new boolean[MAX+1];
        for(int i = 2; i <= MAX; i++) {
            prime[i] = true;
        }

        for(int i = 2; i <= MAX; i++) { // 에라토스테네스의 체
            if(prime[i]) {
                for(int j = 2*i; j <= MAX; j += i) {
                    prime[j] = false;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();

            for(int j = 2; j <= n/2; j++) { // 절반만 구하여 작은 수만 리스트에 저장
                if(prime[j]) {
                    if(prime[n-j]) {
                        list.add(j);
                    }
                }
            }

            int max = 0; // 리스트 중 가장 큰 값이 차이가 가장 적음
            for(int g : list) {
                if(g > max) max = g;
            }

            answer.append(max).append(" ").append(n-max).append("\n");
        }

        System.out.println(answer.toString());
    }
}