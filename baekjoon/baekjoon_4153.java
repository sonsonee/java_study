import java.io.*;
import java.util.*;

public class baekjoon_4153 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        while(true) {

            st = new StringTokenizer(br.readLine());
            int[] l = new int[3];
            for(int i = 0; i < 3; i++) {
                l[i] = Integer.parseInt(st.nextToken());
            }
            
            if(l[0] == 0 || l[1] == 0 || l[2] == 0) break;
            else {
                Arrays.sort(l);
                if((long)Math.pow(l[0], 2) + (long)Math.pow(l[1], 2) == (long)Math.pow(l[2], 2)) {
                    answer.append("right\n");
                } else {
                    answer.append("wrong\n");
                }
            }
        }
        
        System.out.println(answer.toString());
    }
}