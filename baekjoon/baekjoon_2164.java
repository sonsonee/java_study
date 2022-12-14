import java.io.*;
import java.util.*;

public class baekjoon_2164 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while(true) {
            Integer cur = queue.poll();
            if(queue.isEmpty()) {
                System.out.println(cur);
                break;
            } else {
                queue.add(queue.poll());
            }
        }
    }
}