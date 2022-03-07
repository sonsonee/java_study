import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_11568 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int[] arr;
    static int[] d;

    public static void main(String[] args) throws IOException {
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    
        d = new int[N];
        for(int i = 0; i < N; i++){
            d[i] = 1;
            for(int j = 0; j < i; j++){
                
                if(arr[j] < arr[i] && d[i] < d[j] + 1){
                    d[i] = d[j] + 1;
                }
            }
        }

        int result = Arrays.stream(d).max().getAsInt();
        System.out.println(result);
    }
}
