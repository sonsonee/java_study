import java.io.*;
import java.time.LocalTime;
import java.util.*;

public class baekjoon_19583 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        String[] s = st.nextToken().split(":");
        LocalTime S = LocalTime.of(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

        s = st.nextToken().split(":");
        LocalTime E = LocalTime.of(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

        s = st.nextToken().split(":");
        LocalTime Q = LocalTime.of(Integer.parseInt(s[0]), Integer.parseInt(s[1]));


        Map<String, Integer> chatRecord = new HashMap<>();

        while(true) {

            String line = br.readLine();

            if(line == null) break;

            st = new StringTokenizer(line);
            s = st.nextToken().split(":");
            LocalTime chatTime = LocalTime.of(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

            if(chatTime.isAfter(Q)) continue;

            String name = st.nextToken();
            if(!chatRecord.containsKey(name)) { // map에 포함되지 않음 
                if(chatTime.isBefore(S) || chatTime.equals(S)) { // 시작 전 채팅에 참여함
                    chatRecord.put(name, 1);
                }
            } else { // map에 포함되어 있을 때 = 시작 전에 채팅 참여함
                if((chatTime.isAfter(E) || chatTime.equals(E)) 
                        && (chatTime.isBefore(Q) || chatTime.equals(Q))) { // 퇴장 시간에 채팅 참여함
                    chatRecord.put(name, 2);
                 }
            }
        }

        int answer = 0;
        for(String name : chatRecord.keySet()) {
            if(chatRecord.get(name) == 2) answer++;
        }

        System.out.println(answer);
    }
}