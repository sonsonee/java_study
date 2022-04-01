import java.util.Scanner;

public class baekjoon_9655 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if(N % 2 == 0){
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}