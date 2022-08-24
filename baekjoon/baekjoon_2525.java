import java.util.Scanner;

public class baekjoon_2525 {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            int HH = scanner.nextInt();
            int mm = scanner.nextInt();

            int time = scanner.nextInt();

            if(time >= 60) {
                HH += (time / 60);
                mm += (time % 60); 
            } else {
                mm += time;
            }

            if(mm >= 60) { 
                HH++;
                mm -= 60;
            }

            if(HH >= 24) 
                HH -= 24;

            System.out.println(HH + " " + mm);
        }
    }
    
}