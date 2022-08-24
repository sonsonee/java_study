import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_3052 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        boolean[] check = new  boolean[42];

        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            check[n%42] = true;
        }

        int count = 0;
        for(boolean b : check) {
            if(b == true) count++;
        }

        System.out.println(count);
    }
}