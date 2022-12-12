import java.io.*;

public class baekjoon_1654 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        String s[] = br.readLine().split(" ");
        int K = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);
        int[] len = new int[K];

        long max = 0;
        for(int i = 0; i < K; i++) {
            len[i] = Integer.parseInt(br.readLine());
            if(max < len[i]) max = len[i];
        }

        // 이분탐색
        long low = 0;
        long high = max+1;
        
        while(low < high) {
            long mid = (low + high) / 2;
            
            int sum = 0;
            for(int i = 0; i < K; i++) {
                sum += len[i] / mid;
            }
                

            if(sum < N) {
                high = mid;
            } else {
                low = mid + 1;
            }
            
        }

        System.out.println(low-1);
        return ;
    }
    
}