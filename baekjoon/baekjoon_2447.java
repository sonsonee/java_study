import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2447 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int k = (int) Math.pow(N, 1.0/3.0);
         
        recursive(N, k);

        System.out.println(answer.toString());
    }

    static void recursive(int N, int k) {

        if(N == 0) { //종료조건
            
            return;
        }
        recursive(N, k);

    }
}
