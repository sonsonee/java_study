import java.io.*;
import java.util.*;

public class baekjoon_10814 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        Map<Integer, List<String>> members = new HashMap<>();
        
        for(int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if(!members.containsKey(age)) { // 새로 등록되면서 리스트가 없을 때는 NullPointerException 일어나므로 새 리스트 등록
                List<String> names = new ArrayList<>();
                names.add(name);
                members.put(age, names);
            } else {
                members.get(age).add(name);
            }
        }

        List<Integer> keySet = new ArrayList<>(members.keySet());
        Collections.sort(keySet);

        for(Integer key : keySet) {
            for(String m : members.get(key)) {
                answer.append(key).append(" ").append(m).append("\n");
            }
        }

        System.out.println(answer.toString());
    }
}