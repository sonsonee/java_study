import java.util.Scanner;

public class baekjoon_1439 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        int zero = 0;
        int one = 0;
        if(s.charAt(0) == '0') zero++;
        else one++;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1))
                if(s.charAt(i) == '0')
                    zero++;
                else
                    one++;
        }
        
        System.out.println(Math.min(zero, one));
    }
}