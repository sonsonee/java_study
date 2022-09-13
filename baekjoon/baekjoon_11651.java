import java.io.*;
import java.util.*;

public class baekjoon_11651 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> coordi = new HashMap<>(); // y, x

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Integer x = Integer.valueOf(st.nextToken());
            Integer y = Integer.valueOf(st.nextToken());

            if(!coordi.containsKey(y)) {
                List<Integer> X = new ArrayList<>();
                X.add(x);
                coordi.put(y, X);
            } else {
                coordi.get(y).add(x);
            }
        }

        List<Integer> keySet = new ArrayList<>(coordi.keySet());
        Collections.sort(keySet); // y 값으로 오름차순 정렬 

        for(Integer key : keySet) { 
            List<Integer> values = coordi.get(key);
            Collections.sort(values); // x 값으로 오름차순 정렬
            for(Integer v : values) { 
                answer.append(v).append(" ").append(key).append("\n");
            }
        }

        System.out.println(answer.toString());
    }
}