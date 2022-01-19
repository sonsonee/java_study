import java.util.*;

class baekjoon_1668{

	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] height = new int[n];
		
		for(int i = 0; i < n; i++)
			height[i] = scanner.nextInt();
		
		int left = 1;
		int right = 1;
		
		int max_left = height[0];
		int max_right = height[n-1];
		
		for(int i = 1; i < n; i++){
			
			if(max_left < height[i]){
				left++;
				max_left = height[i];
			}
			
			if(max_right < height[n-i-1]){
				right++;
				max_right = height[n-i-1];
			}
		}
		
		System.out.println(left);
		System.out.println(right);
	}
}