import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1193 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int X = Integer.parseInt(br.readLine());
        
        int level = 1;
        int dis = 0;

        while(true) {
            if(X <= (level*(level+1))/2) {
                dis = Math.abs(X - ((level*(level+1))/2));
                break;
            }
            level++;
        }

        int t = 0;
        int b = 0;

        if(level%2 == 0) { // 짝수
            t = level - dis;
            b = level + 1 - t;

        } else { // 홀수
            b = level - dis;
            t = level + 1 - b;
        }

        System.out.println(t + "/" + b);
    }
}