import java.util.*;

class baekjoon_10798{

	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String[] words = new String[5];
		for(int i = 0; i < 5; i++)
			words[i] = scanner.nextLine();
		
		String vertical = "";

		for(int i = 0; i < 15; i++){
			for(int j = 0; j < 5; j++){
				if(i < words[j].length())
					vertical += words[j].charAt(i);
			}
		}
		
		System.out.print(vertical);
	}
}