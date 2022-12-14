import java.io.*;
import java.util.*;

public class baekjoon_11866 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++) queue.add(i);

        answer.append("<");
        while(!queue.isEmpty()) {
            
            for(int i = 0; i < K-1; i++) {
                queue.add(queue.poll());
            }

            Integer Kth = queue.poll();
            if(queue.isEmpty()) {
                answer.append(Kth).append(">");
            } else {
                answer.append(Kth).append(", ");
            }
        }

        System.out.println(answer.toString());
    }
}