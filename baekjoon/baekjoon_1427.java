import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baekjoon_1427 {

    static StringBuilder answer = new StringBuilder();
    
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String N = scanner.nextLine();

            Integer[] nums = new Integer[N.length()];
            
            for(int i = 0; i < N.length(); i++) {
                nums[i] = Integer.valueOf(N.charAt(i) - '0');
            }

            Arrays.sort(nums, Comparator.reverseOrder());

            for(Integer i : nums) {
                answer.append(i);
            }
        }

        System.out.println(answer);
    }
}