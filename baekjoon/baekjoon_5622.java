import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_5622 {

    static BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        String[] dial = {null, null, "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        
        String s = br.readLine();

        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
                for(int j = 2; j < 10; j++) {
                    if(dial[j].indexOf(s.charAt(i)) != -1) {
                        answer += j+1;
                    }
                }
        }

        System.out.println(answer);
    }
}