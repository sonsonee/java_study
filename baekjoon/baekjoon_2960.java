import java.util.Scanner;

public class baekjoon_2960 {

    static int MAX = 1001;
    static boolean[] prime = new boolean[MAX];
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        in.close();

        int count = 0;
        int ans = 0;

        for(int i = 2; i < N+1; i++){
            prime[i] = true;
        }

        // 에라토스테네스의 체
        for(int i = 2; i < N+1; i++){
            if(prime[i]) {
                // 기존의 알고리즘과 다르게 소수도 false
                prime[i] = false;
                count++;
                if(count == K) ans = i;
                for(int j = i*i; j < N+1; j += i){
                    if(prime[j]){
                        prime[j] = false;
                        count++;
                        if(count == K) ans = j;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
