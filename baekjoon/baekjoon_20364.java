import java.util.*;
import java.io.*;

class baekjoon_20364{
	
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();	// append를 위한 StringBuilder 선언
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		boolean[] owned = new boolean[N+1];	// 땅의 종속 여부
		int[] want = new int[Q];				// 오리들이 원하는 땅
		for(int i = 0; i < Q; i++){
			want[i] = Integer.parseInt(br.readLine());
		}
		
		for(int x : want){
			
			int tmp = x, answer = 0;
			while(tmp != 1){
				if(owned[tmp]){	// 이미 차지된 땅일 경우
					answer = tmp;
				}
				tmp /= 2;
			}
			owned[x] = true;	// 이미 차지된 땅은 원래도 true
								// 이번에 차지할 땅도 true
			
			// StringBuilder 사용해서 문자열 연산 시 실행 시간이 단축됨
			sb.append(answer).append('\n');
		}
		
		// StringBuilder로 출력할 때
		System.out.print(sb.toString());
	}
}