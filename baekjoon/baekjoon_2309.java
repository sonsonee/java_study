package baekjoon;
import java.util.*;

class baekjoon_2309{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int[] dwarf = new int[9];
		for(int i = 0; i < dwarf.length; i++){
			dwarf[i] = scanner.nextInt();
		}	
		
		int sum = 0;
		for(int i = 0; i < dwarf.length; i++){
			sum += dwarf[i];
		}
		
		outer:
		for(int i = 0; i < dwarf.length - 1; i++){
			for(int j = i + 1; j < dwarf.length; j++){
				if(sum - dwarf[i] - dwarf[j] == 100){
					dwarf[i] = dwarf[j] = 0;
					break outer;
				}
			}
		}
		
		Arrays.sort(dwarf);
		for(int i = 2; i < dwarf.length; i++)
			System.out.println(dwarf[i]);
	}
}