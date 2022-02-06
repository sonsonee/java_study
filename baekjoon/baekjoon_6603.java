package baekjoon;
import java.util.Scanner;

class baekjoon_6603{

	public static void main (String[] args){
		
		try (Scanner scanner = new Scanner(System.in)) {
			while(true){
				
				int k = scanner.nextInt();
				if(k == 0) break;
				
				int[] S = new int[k];
				for(int i = 0; i < k; i++){
					S[i] = scanner.nextInt();
				}
				int[] index = new int[6];
				for(index[0] = 0; index[0] < k - 5; index[0]++){
					for(index[1] = index[0] + 1; index[1] < k - 4; index[1]++){
						for(index[2] = index[1] + 1; index[2] < k - 3; index[2]++){
							for(index[3] = index[2] + 1; index[3] < k - 2; index[3]++){
								for(index[4] = index[3] + 1; index[4] < k - 1; index[4]++){
									for(index[5] = index[4] + 1; index[5] < k; index[5]++){
										for(int p = 0; p < 6; p++){
											System.out.print(S[index[p]] + " ");
										}
										System.out.println();
									}
								}
							}
						}
					}
				}
				System.out.println();
			}
		}
	}
}