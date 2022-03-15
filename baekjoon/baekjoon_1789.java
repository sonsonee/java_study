import java.util.Scanner;

public class baekjoon_1789 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long S = Long.parseLong(in.nextLine());
        in.close();

        long sum = 0;
        int cnt = 0;
        for(long i = 1; i <= S; i++){
            sum += i;
            cnt++;
            if(sum > S){
                System.out.println(cnt-1);
                break;
            }
        }
    }
}
