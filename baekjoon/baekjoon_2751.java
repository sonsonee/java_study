import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_2751 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        for(int n : nums) {
            answer.append(n).append("\n");
        }

        System.out.println(answer.toString());
    }
}