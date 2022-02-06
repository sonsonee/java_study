package baekjoon;
// 작성 중
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class baekjoon_9421{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder result = new StringBuilder();
	
	static boolean[] d;
	static int[] e;
	
	public static void main(String[] args) throws IOException{
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		d = new boolean[N+1];
		e = new int[N+1];
		
		// 에라토스테네스의 체
		for (int i = 2; i <= N; i++) {
			if (!d[i]) continue;	// 이미 체에서 걸러 소거된 수
			for (int j = i * i; j <= N; j+=i) {
				d[j] = false;
			}
		}
		
		// 상근수 거르기 : 소수 상근수면 1, 아니면 2
		for(int i = 2; i <= N; i++){
			if(!d[i]) e[i] = 2;
			if(e[i] == 0)
				e[i] = recursive(i);
		}
		
		for(int i = 2; i <= N; i++){
			if(e[i] == 1) result.append(i).append("\n");
		}
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
	
	static int recursive(int i){
		if(e[i] == 2){
			return 2;
		}
		if(i == 0){
			return 1;
		}

			String s = Integer.toString(i);
			char[] digit = s.toCharArray();
			int sum = 0;
			for(char c:digit){
				sum += (int)((c - '0') * (c - '0'));
			}

			e[i] = recursive(sum);
			
			if(e[i] == 1) return 1;
			else return 2;
		
	}
}