package baekjoon;
import java.io.*;
import java.util.*;

class baekjoon_6550{

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
	
		String line;
		while((line = br.readLine()) != null){
			
			st = new StringTokenizer(line);
			String s = st.nextToken();
			String t = st.nextToken();
			
			int count = 0;
			
			for(int i = 0; i < t.length(); i++){
				if(s.charAt(count) == t.charAt(i))
					count++;
				if(count == s.length())
					break;
			}
			
			if(count == s.length())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}