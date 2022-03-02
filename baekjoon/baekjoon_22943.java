import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_22943 {

    static int K, M, ans;
    static int MAX = 100001;
    static boolean[] prime = new boolean[MAX];
    static boolean[] primeSum = new boolean[MAX];
    static boolean[] primeMulti = new boolean[MAX];
    static boolean[] visited = new boolean[10];

    public static void main(String[] args){
        
        // 에라토스테네스의 체
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i = 2; i*i < MAX; i++){
            if(prime[i]){
                for(int j = i*i; j < MAX; j += i){
                    prime[j] = false;
                }
            }
        }

        // 두 개의 서로 다른 소수의 합
        for(int i = 2; i < MAX - 1; i++){
            if(prime[i]){
                for(int j = i + 1; j < MAX; j++){
                    if(prime[j] && i+j < MAX)
                        primeSum[i+j] = true;   
                }
            }
        }

        // 두 개의 소수의 곱
        for(int i = 2; i*i < MAX; i++){
            if(prime[i]){
                for(int j = i; j < MAX; j++){
                    if(prime[j]){
                        if((long)i * (long)j < MAX)
                            primeMulti[i*j] = true;
                    }
                }
            }
        }

        Scanner in = new Scanner(System.in);
        K = in.nextInt();
        M = in.nextInt();
        in.close();
        
        recursive(0, 0);
        System.out.println(ans);
    }

    // X를 M으로 나누어 떨어지지 않을 때까지 나누기
    static int divide(int X, int M){
        if(X % M != 0){
            return X;
        }
        else{
            return divide(X/M, M);
        }
    }

    static void recursive(int cnt, int num){
        // 종료 조건
        if(cnt == K){
            if(num < MAX){
                if(primeSum[num] && primeMulti[divide(num, M)])
                    ans++;
            }
            return ;
        }

        // 작업 : 순열 알고리즘
        for(int i = 0; i < 10; i++){
            if(cnt == K - 1 && i == 0) continue;
            if(visited[i]) continue;

            visited[i] = true;
            recursive(cnt+1, (int)(num + i * (Math.pow(10, cnt))));
            visited[i] = false;
        }

        // 종료
    }
}