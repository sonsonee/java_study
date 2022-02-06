package baekjoon;
import java.util.*;

class baekjoon_21313{

	static Scanner scanner = new Scanner(System.in);
	static StringTokenizer st;
	static StringBuilder result = new StringBuilder();
	
	public static void main (String[] args){
		
		int n = scanner.nextInt();
		
		int odd = 0;
		if(n % 2 == 1) odd = 1;

		for(int i = 0; i < n - odd; i += 2){
			result.append(1).append(' ').append(2).append(' ');
		}
		
		if(odd == 1) result.append(3);
		
		System.out.print(result.toString());
	}
}