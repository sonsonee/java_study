import java.util.*;
import java.io.*;

class baekjoon_11365{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder result = new StringBuilder();
	

	public static void main(String[] args) throws IOException{

		while(true){
			String str = br.readLine();
			
			if(str.equals("END"))
				break;
			
			for(int i = str.length() - 1; i >= 0; i--){
				result.append(str.charAt(i));
			}
			result.append("\n");
		}
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}