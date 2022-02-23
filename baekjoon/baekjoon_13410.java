import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class baekjoon_13410{

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
	
		String s = br.readLine();
		String[] arr = s.split(" ");
		
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
	
		int max = 0;
		for(int i = 1; i <= K; i++){
			
			int r = reverse(N*i);
			if(max < r)
				max = r;
			
		}
		
		System.out.print(max);
	}
	
	static int reverse(int x){
		String str = Integer.toString(x);
		StringBuilder tmp = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--){
			tmp.append(str.charAt(i));
		}
		return Integer.parseInt(tmp.toString());
	}
}