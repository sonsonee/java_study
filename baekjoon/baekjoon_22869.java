package baekjoon;
import java.io.*;
import java.util.*;

class baekjoon_22869{

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int N;
	static int K;
	static int[] A;
	static boolean[] d;
	
	public static void main(String[] args) throws IOException {
	
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		A = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			A[i+1] = Integer.parseInt(st.nextToken());
		}
		br.close();

		d = new boolean[N+1];	// 도달 가능하면 true, 아니면 false
		d[1] = true;
		for(int i = 1; i < N; i++){
			for(int j = i + 1; j <= N; j++){
				if(d[i] && (j - i) * (1 + Math.abs(A[i]-A[j])) <= K)
					d[j] = true;
			}
		}
		
		if(d[N])
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}