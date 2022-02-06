package baekjoon;
import java.util.*;
import java.io.*;

class baekjoon_11256{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder result = new StringBuilder();

	public static void main(String[] args) throws IOException{

		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++){
			
			st = new StringTokenizer(br.readLine());
			int J = Integer.parseInt(st.nextToken());	
			int N = Integer.parseInt(st.nextToken());
			
			Integer[] box_size = new Integer[N];
			
			for(int j = 0; j < N; j++){
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				box_size[j] = x * y;
			}
			
			Arrays.sort(box_size, Collections.reverseOrder());
			
			int boxcnt = 0;
			int candycnt = J;
			
			for(int j = 0; j < N; j++){
				if(candycnt == 0) break;
				if(box_size[j] >= candycnt){
					boxcnt++;
					candycnt -= box_size[j];
					break;
				}
				else{
					boxcnt++;
					candycnt -= box_size[j];
				}
			}
			
			result.append(boxcnt).append('\n');
		}
		
		System.out.print(result.toString());
	}
}