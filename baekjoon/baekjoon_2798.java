import java.util.*;

class baekjoon_2798{

	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] card = new int[n];
		for(int i = 0; i < n; i++)
			card[i] = scanner.nextInt();
		
		
		int ans = 0;
		outer:
		for(int i = 0; i < n - 2; i++){
			
			int tmp = 0;
			for(int j = i + 1; j < n - 1; j++){
				for(int k = j + 1; k < n; k++){
					
					tmp = card[i] + card[j] + card[k];
					
					if(tmp == m) {
						ans = tmp;
						break outer;
					}
					
					if(tmp < m && tmp > ans) ans = tmp;
				}
			}
		}
		
		System.out.print(ans);
	}
}