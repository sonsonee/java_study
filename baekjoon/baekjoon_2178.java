import java.io.*;
import java.util.*;

public class baekjoon_2178 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public int solution(int N, int M, int[][] map) {

        int[] dx = {0, 0, 1, -1};
        int[] dy = {-1, 1, 0, 0};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {1, 1, 1});

        boolean[][] visited = new boolean[N+1][M+1];

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();

            if(cur[0] == N && cur[1] == M) return cur[2];

            for(int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx < 1 || ny < 1 || nx > N || ny > M) continue;
                if(map[nx][ny] == 0 || visited[nx][ny] == true) continue;

                queue.add(new int[] {nx, ny, cur[2]+1});
                visited[nx][ny] = true;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[][] map = new int[N+1][M+1];

        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            for(int j = 1; j <= M; j++) {
                map[i][j] = str.charAt(j-1) - '0';
            }
        }

        System.out.println(solution(N, M, map));
    }
}