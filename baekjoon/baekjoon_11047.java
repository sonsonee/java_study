import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class baekjoon_11047{

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder result = new StringBuilder();

	public static void main(String[] args) throws IOException {
	
		String s = br.readLine();
		String[] arr = s.split(" ");
		
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = Integer.parseInt(br.readLine());
		}
		
		int remain = K;
		int coin = 0;
		while(remain != 0){
			for(int i = N - 1; i >= 0; i--){
				while(remain >= A[i]){
					remain -= A[i];
					coin++;
				}
			}
		}
		
		System.out.print(coin);
	}
}