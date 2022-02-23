import java.util.*;
import java.io.*;

class baekjoon_10546{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{

		String str = br.readLine();
		int N = Integer.parseInt(str);
		
		Map<String, Integer> participant_result = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++){
			str = br.readLine();
			if(participant_result.containsKey(str)){
				int cnt = participant_result.get(str);
				participant_result.replace(str, cnt + 1);
			}
			else{
				participant_result.put(str, 1);
			}
		}
		
		for(int i = 0; i < N - 1; i++){
			str = br.readLine();
			int cnt = participant_result.get(str);
			if(cnt - 1 == 0)
				participant_result.remove(str);
			else
				participant_result.replace(str, cnt - 1);	
		}
		
		br.close();
		
		for(String unfinished : participant_result.keySet())
			System.out.print(unfinished);
	}
}