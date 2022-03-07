import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_21920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        int[] answer = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            if(gcd(arr[i], X) == 1){
                answer[count++] = arr[i];
            }
        }

        double mean = 0;
        for(int i = 0; i < count; i++){
            mean += answer[i];
        }
        mean = (double)(mean / count);
        System.out.print(mean);
    }

    static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
