import java.io.*;
import java.util.*;

public class baekjoon_1920 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        Set<String> A = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) A.add(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            if(A.contains(st.nextToken())) answer.append("1\n");
            else answer.append("0\n");
        }

        System.out.println(answer.toString());
    }
}