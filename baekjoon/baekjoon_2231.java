import java.util.*;

class baekjoon_2231{

	public static void main (String[] args){
		
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			String str_n = Integer.toString(n);
			int max_gap = str_n.charAt(0) - '0' + ((str_n.length() - 1) * 9);
			
			int ans = 0;
			for(int i = 0; i < max_gap; i++){
				
				int tmp = n - max_gap + i;
				String str_tmp = Integer.toString(tmp);
				int sum = tmp;
				
				for(int j = 0; j < str_tmp.length(); j++)
					sum += str_tmp.charAt(j) - '0';
				
				if(sum == n) {
					ans = tmp;
					break;
				}
			}
			
			System.out.print(ans);
		}
	}
}