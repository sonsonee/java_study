import java.util.Scanner;

public class baekjoon_1343 {

    static StringBuilder result = new StringBuilder();

    static String a = "AAAA";
    static String b = "BB";

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        int count = 0;
        boolean comma = (s.charAt(0) == '.');
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'X'){
                comma = false;
                count++;
            }else{
                if(!comma){ //이전까지 X였으면
                    if(polyomino(count) == -1) {
                        System.out.println(-1);
                        return ;
                    }
                    count = 0;
                }
                result.append('.');
                comma = true;
            }
            
            if(i == s.length() - 1) {  // 마지막 문자
                if(comma){
                    for(int j = 0; j < count; j++)
                        result.append('.');
                }else{
                    if(polyomino(count) == -1) {
                        System.out.println(-1);
                        return ;
                    }
                }
            }
        }

        System.out.println(result.toString());
    }

    static private int polyomino(int count){
        if(count % 4 == 0){
            for(int j = 0; j < count / 4; j++)
                result.append(a);
            return 1;
        }
        else if(count % 2 == 0){
            int remain = count;
            while(remain > 0){
                if(remain > 4){
                    result.append(a);
                    remain -= 4;
                }else{
                    result.append(b);
                    remain -= 2;
                }
            }
            return 1;
        }
        else{
            return -1;
        }
    }
}
