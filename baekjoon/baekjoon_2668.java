import java.io.*;
import java.util.Arrays;

public class baekjoon_2668 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        visited = new boolean[N+1];
        
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int num = 0;
        int[] answer = new int[101];
        for(int i = 1; i <= N; i++) {
            if(dfs(i, i)) {
                answer[num++] = i;
            }
        }
        Arrays.sort(answer);

        System.out.println(num);
        for(int i = 0; i < num; i++) sb.append(answer[i]).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static boolean dfs(int target, int current) {
        if(visited[current] == false) {
            visited[current] = true;
            return dfs(target, arr[current]);
        } else {
            return target == current;
        }
    }
}