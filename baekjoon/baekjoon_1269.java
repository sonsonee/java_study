package baekjoon;
import java.io.*;
import java.util.*;

class baekjoon_1269{

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
	
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i++){
			int tmp = Integer.parseInt(st.nextToken());
			if(map.get(tmp) != null){
				int cnt = map.get(tmp);
				map.replace(tmp, cnt+1);
			}
			else
				map.put(tmp, 1);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < B; i++){
			int tmp = Integer.parseInt(st.nextToken());
			if(map.get(tmp) != null){
				int cnt = map.get(tmp);
				map.replace(tmp, cnt+1);
			}
			else
				map.put(tmp, 1);
		}
		
		br.close();
		
		int result = 0;
		for(Integer key : map.keySet()){
			if(map.get(key) == 1)
				result++;
		}
		
		System.out.print(result);
	}

}