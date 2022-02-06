package baekjoon;
import java.util.*;

class baekjoon_2744{

	public static void main (String[] args){
		
		try (Scanner scanner = new Scanner(System.in)) {
			String str = scanner.nextLine();
			String changed = "";
			
			for(int i = 0; i < str.length(); i++){
				
				char tmp = str.charAt(i);
				
				if(tmp >= 'a' && tmp <= 'z')
					changed += (char)(tmp - 32);
				else if(tmp >= 'A' && tmp <= 'Z')
					changed += (char)(tmp + 32);
				else
					changed += tmp;
				
			}
			
			System.out.print(changed);
		}
	}
}