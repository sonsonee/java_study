import java.io.*;

public class baekjoon_2805 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        s = br.readLine().split(" ");

        int[] trees = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(s[i]);
            max = Math.max(max, trees[i]);
        }

        int low = 0;
        int high = max+1;

        while(low < high) {
            int mid = (low + high) / 2;

            long sum = 0;
            for(int i = 0; i < N; i++) {
                sum = trees[i] > mid ? sum + (trees[i] - mid) : sum; 
            }
            
            // sum이 M보다 작으면 더 많이 자르기 위해 최대 H를 줄이고,
            // 그 외에는 더 적게 자르기 위해 최소 H를 늘려준다.
            if(sum < M) { 
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        
        System.out.println(low-1);

    }
}