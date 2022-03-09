import java.util.Scanner;

public class baekjoon_1436 {

    static int MAX_N = 10001;
    static String[] title = new String[MAX_N];

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        in.close();

        int count = 1;
        long num = 1;
        while(count < MAX_N){
            String s = Long.toString(num++);
            if(s.contains("666")){
                title[count++] = s;
            }
        }

        System.out.print(title[N]);
    }
}