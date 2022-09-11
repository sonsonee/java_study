import java.io.*;
import java.util.*;

/* 2108 - 통계학 */ 
public class baekjoon_2108 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException{
        
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        int sum = 0; // 합계
        int avg = 0;
        int mid = 0;
        int mode = 0;
        int max = -10000;
        int min = 10000;
        int range = 0;
        int[] count = new int[8001];


        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];

            //count에는 nums + 4000 으로 저장
            count[nums[i] + 4000]++;

            // min, max 구하기
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }

        Arrays.sort(nums);

        avg = Math.round((float)sum / N);
        answer.append(avg).append("\n");

        mid = nums[(N-1)/2];
        answer.append(mid).append("\n");

        // 최빈값 구하기
        int max_count = 0;
        boolean flag = false;
        for(int i = 0; i < 8001; i++) {
            if(count[i] > max_count) {
                max_count = count[i];
                mode = i - 4000;
                flag = true;
            } else if(count[i] == max_count && flag) {
                mode = i - 4000;
                flag = false;
            }
        }

        answer.append(mode).append("\n");

        range = Math.abs(max - min);
        answer.append(range).append("\n");

        System.out.println(answer.toString());
    }
}