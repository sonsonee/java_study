// 작성중
import java.util.*;

class baekjoon_15658{
		
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] An = new int[n];
		for(int i = 0; i < n; i++)
			An[i] = scanner.nextInt();
		
		int[] op = new int[4];
		int sum = 0;
		for(int i = 0; i < 4; i++){
			op[i] = scanner.nextInt();
			sum += op[i];
		}
		
		int numOfCases = sum;
		for(int i = 1; i < n; i++)
			numOfCases *= (sum - i);
		
		int min = 0;
		int max = 0;
	
		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < 	}
}