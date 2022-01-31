import java.util.*;
import java.io.*;

class baekjoon_10809{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder result = new StringBuilder();

	public static void main(String[] args) throws IOException{

		String S = br.readLine();
		br.close();
		
		int[] pos = new int[26];
		for(int i = 0 ; i < 26; i++)
			pos[i] = -1;
		
		for(int i = 0; i < S.length(); i++){
			if(pos[S.charAt(i) - 'a'] == -1){
				pos[S.charAt(i) - 'a'] = i;
			}
		}
		
		for(int i = 0; i < 26; i++)
			result.append(pos[i]).append(' ');
		
		System.out.println(result.toString());
	}
}