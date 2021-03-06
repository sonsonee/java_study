import java.util.*;

class baekjoon_1718{

	public static void main (String[] args){
		
		try (Scanner scanner = new Scanner(System.in)) {
			String sentence = scanner.nextLine();
			String key = scanner.nextLine();
			String cypher = "";

			for(int i = 0, j = 0; i < sentence.length(); i++, j++){
				if(j == key.length()) j = 0;
				if(sentence.charAt(i) == ' ') {
					cypher += ' ';
					continue;
				}
				
				if(sentence.charAt(i) - key.charAt(j) > 0){
					cypher += (char)(sentence.charAt(i) - key.charAt(j) + 'a' - 1);
				}
				else{
					cypher += (char)(sentence.charAt(i) - key.charAt(j) + 'a' + 25);
				}
			}
			
			System.out.print(cypher);
		}
	}
}