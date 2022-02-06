package baekjoon;
import java.util.*;
import java.io.*;

class baekjoon_15655{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder result = new StringBuilder();
	
	private static int N, M;
	private static int[] arr;
	private static int[] tmp;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException{

		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		arr = new int[N];
		tmp = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		Arrays.sort(arr);
		backtrack(0, 0);
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
	
	public static void backtrack(int depth, int start){
		if(depth == M){
			for(int i = 0; i < M; i++){
				result.append(tmp[i]).append(' ');
			}
			result.append('\n');
		}
		else{
			for(int i = start; i < N; i++){
				if(!visited[i]){
					visited[i] = true;
					tmp[depth] = arr[i];
					backtrack(depth+1, i+1);
					visited[i] = false;
				}
			}
		}
	}
}