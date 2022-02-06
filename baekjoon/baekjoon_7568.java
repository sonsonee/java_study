package baekjoon;
import java.io.*;
import java.util.*;

class baekjoon_7568{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder result = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[][] measure = new int[N][2];
		
		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			measure[i][0] = Integer.parseInt(st.nextToken());
			measure[i][1] = Integer.parseInt(st.nextToken());
		}
	
		for(int i = 0; i < N; i++){
			int cnt = 0;
			for(int j = 0; j < N; j++){
				if(measure[j][0] > measure[i][0] && measure[j][1] > measure[i][1])
					cnt++;
			}
			result.append(cnt+1).append(' ');
		}

		System.out.print(result.toString());
	}
}