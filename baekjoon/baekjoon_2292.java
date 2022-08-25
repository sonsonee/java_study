import java.util.Scanner;

public class baekjoon_2292 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();

            int level = 1;
            int now = 1;
            
            while(true) {
                if(now >= N) break;

                now += level*6;
                level++;
            }

            System.out.println(level);
        }
    }
}