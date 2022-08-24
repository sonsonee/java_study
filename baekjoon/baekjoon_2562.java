import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2562 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        
        int[] nums = new int[9];

        int max = 0;
        int max_index = -1;

        for(int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());

            if(max < nums[i]) {
                max = nums[i];
                max_index = i;
            }
        }

        System.out.println(max);
        System.out.println(max_index+1);
    }
}