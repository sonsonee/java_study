/* 작성중 */
import java.util.*;
import java.io.*;

class baekjoon_12033{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder result = new StringBuilder();
	
	static int[] P;
	static int[] ans;
	static boolean[] visit;
	static int T;
	static int N;

	public static void main(String[] args) throws IOException{

		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++){
			
			N = Integer.parseInt(br.readLine());	
			P = new int[N*2];
			ans = new int[N];
			visit = new boolean[N];
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N*2; j++){
				P[j] = Integer.parseInt(st.nextToken());
			}
			result.append("Case #").append(i+1).append(": ");
			backtrack(0);
			
		}
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
	
	public static void backtrack(int count){
		if(count == N){
			for(int i = 0; i < N; i++){
				result.append(ans[i]).append(' ');
			}
			result.append('\n');
		}
		else{
			for(int i = 0; i < N; i++){
				if(P[i]%3 != 0) continue;
				
				int price = P[i] * (4 / 3);
				if(Arrays.asList(P).contains(price)){
					ans[count] = P[i];
					visit[i] = visit[Arrays.asList(P).indexOf(price)] = true;
					backtrack(count+1);
					visit[i] = visit[Arrays.asList(P).indexOf(price)] = false;
				}
			}
		}
	}
}