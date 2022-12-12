import java.io.*;
import java.util.*;

public class baekjoon_1966 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            LinkedList<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                queue.add(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            while(!queue.isEmpty()) {

                int[] cur = queue.poll();
                
                boolean pushback = false;
                for(int i = 0; i < queue.size(); i++) {
                    if(cur[1] < queue.get(i)[1]) {
                        queue.add(cur);
                        pushback = true;
                        break;
                    }
                }

                if(!pushback) {
                    count++;
                    if(cur[0] == M) {
                        System.out.println(count);
                        break;
                    }
                }

            }
        }
    }
}
