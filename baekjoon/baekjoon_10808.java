import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class baekjoon_10808{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder result = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		char[] S = br.readLine().toCharArray();
		int[] cnt = new int[26];
		br.close();
		
		for(char c : S)
			cnt[c - 'a']++;
	
		for(int i : cnt)
			result.append(i).append(' ');
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
}