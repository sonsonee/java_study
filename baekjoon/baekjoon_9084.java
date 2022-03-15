import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_9084 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder result = new StringBuilder();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            int[] coin = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++){
                coin[i] = Integer.parseInt(st.nextToken());
            }
            int M = Integer.parseInt(br.readLine());

            int[] d = new int[10001];
            d[0] = 1;   // coin 값의 배수에 1을 증가시키기 위한 장치
            for(int i = 0; i < N; i++){
                for(int j = coin[i]; j <= M; j++){
                    d[j] += d[j - coin[i]];
                }
            }

            System.out.println(d[M]);
        }

    }
}
