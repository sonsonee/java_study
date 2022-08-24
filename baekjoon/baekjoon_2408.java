import java.util.Scanner;

public class baekjoon_2408 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            int reward = 0;

            if(n1 == n2) {
                if(n2 == n3) { // 주사위 눈 3개가 모두 같은 수
                    reward = 10000 + (n1 * 1000);
                } else {
                    reward = 1000 + (n1 * 100);
                }
            } else { // n1 != n2
                if(n1 == n3) {
                    reward = 1000 + (n1 * 100);
                } else if(n2 == n3) {
                    reward = 1000 + (n2 * 100);
                } else { // 주사위 눈 3개가 서로 다른 수
                    reward = Math.max(n1, Math.max(n2, n3)) * 100;
                }
            }

            System.out.println(reward);
        }
    }
}