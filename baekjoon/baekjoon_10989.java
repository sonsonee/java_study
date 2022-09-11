import java.io.*;

public class baekjoon_10989 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            count[n]++;
        }

        for(int i = 1; i <= 10000; i++) {
            if(count[i] == 0) continue;

            for(int j = 0; j < count[i]; j++) {
                answer.append(i).append("\n");
            }
        }

        System.out.println(answer.toString());
    }
}