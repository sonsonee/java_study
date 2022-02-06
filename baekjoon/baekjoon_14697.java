package baekjoon;
import java.io.*;
import java.util.*;

class baekjoon_14697{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] d = new boolean[N+C+1];
		d[A] = d[B] = d[C] = true;
		for(int i = 1; i <= N; i++){
			if(d[i]){
				d[i+A] = true;
				d[i+B] = true;
				d[i+C] = true;
			}
		}
		
		if(d[N]) System.out.print(1);
		else System.out.print(0);
	}
}