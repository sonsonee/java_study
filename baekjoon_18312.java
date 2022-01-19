import java.util.*;

class baekjoon_18312{

	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		int cnt = 0;
		for(int i = 0; i <= N; i++){
			for(int j = 0; j <= 59; j++){
				for(int k = 0; k <= 59; k++){
					if((i % 10 == K) || (i / 10 == K))
						cnt++;
					else if((j % 10 == K) || (j / 10 == K))
						cnt++;
					else if((k % 10 == K) || (k / 10 == K))
						cnt++;
				}
			}
		}
			
		System.out.print(cnt);
	}
}