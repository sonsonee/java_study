import java.util.*;
import java.io.*;

class baekjoon_15649{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder result = new StringBuilder();
	
	private static int N, M;
	private static int[] tmp;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException{

		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		br.close();
		
		tmp = new int[N];
		visited = new boolean[N];

		dfs(0);
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int depth){
		
		if(depth == M){
			for(int i = 0; i < M; i++){
				result.append(tmp[i]).append(' ');
			}
			result.append('\n');
		}
		else{
			for(int i = 0; i < N; i++){
				if(!visited[i]){
					visited[i] = true;	// 방문한 곳임을 표시
					tmp[depth] = i + 1;
					dfs(depth+1);		// 더 깊이 탐색
					visited[i] = false;	// 재귀 이후에는 visited 다시 false로 변경
				}
			}
		}
	}
}