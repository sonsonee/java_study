import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1990 {

    static final int MAX = 100000001;

    static StringBuilder result = new StringBuilder();
    static boolean[] prime = new boolean[MAX];
    public static void main(String[] args) {

        // 에라토스테네스의 체
        Arrays.fill(prime, true);
        for(int i = 2; i < MAX; i++){
            if(prime[i]){
                for(int j = i+i; j < MAX; j+=i){
                    prime[j] = false;
                }
            }
        }

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        for(int i = a; i <= b; i++){
            if(prime[i]){
                String s = Integer.toString(i);
                boolean isPalindrome = true;
                for(int j = 0; j < s.length() / 2; j++){
                    if(s.charAt(j) != s.charAt(s.length()-1-j))
                        isPalindrome = false;
                }
                if(isPalindrome) result.append(i).append('\n');
            }
        }

        result.append(-1);
        System.out.println(result.toString());
    }
}