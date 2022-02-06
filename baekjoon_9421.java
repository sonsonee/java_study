import java.io.*;
import java.util.*;

class baekjoon_9421{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter();
	static StringBuilder result;
	
	static boolean[] d;
	static boolean[] e;
	
	public static void main(String[] args) throws IOException{
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		d = new boolean[N+1];
		e = new boolean[N+1];
		
		// 에라토스테네스의 체
		for (int i = 2; i <= N; i++) {
			if (!d[i]) continue;	// 이미 체에서 걸러 소거된 수
			for (int j = i * i; j <= N; j+=i) {
				d[j] = false;
			}
		}
		
		// 상근수 거르기 : 상근수면 false
		for(int i = 2; i <= N; i++){
			if(e[i]) continue;
			
		}
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
	
	boolean recursive(){
		
	}
}