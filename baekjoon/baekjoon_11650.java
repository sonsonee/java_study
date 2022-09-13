import java.io.*;
import java.util.*;

public class baekjoon_11650 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> coordi = new HashMap<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Integer x = Integer.valueOf(st.nextToken());
            Integer y = Integer.valueOf(st.nextToken());

            if(!coordi.containsKey(x)) {
                List<Integer> Y = new ArrayList<>();
                Y.add(y);
                coordi.put(x, Y);
            } else {
                List<Integer> Y = coordi.get(x);
                Y.add(y);
                coordi.replace(x, Y);
            }
        }

        List<Integer> keySet = new ArrayList<>(coordi.keySet());
        Collections.sort(keySet);

        // 키 값으로 오름차순 정렬
        for(Integer key : keySet) {
            List<Integer> values = coordi.get(key);
            Collections.sort(values);
            for(Integer v : values) {
                answer.append(key).append(" ").append(v).append("\n");
            }
        }

        System.out.println(answer.toString());
    }
}