import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class baekjoon_2941{

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static public void main(String[] args) throws IOException {
		
		String s = br.readLine();
		br.close();
		
		int cnt = 0;
		for(int i = 0; i < s.length(); i++){
			
			cnt++;
			if(i < s.length() - 1){
				if(s.charAt(i) == 'c'){
					if(s.charAt(i+1) == '-' || s.charAt(i+1) == '=') {
						i++;
						continue;
					}
				}
				else if(s.charAt(i) == 'd'){
					if(s.charAt(i+1) == '-')
						i++;
					else if(i + 2 < s.length())
						if(s.charAt(i+1) == 'z' && s.charAt(i+2) == '=')
							i += 2;
					continue;
				}
				else if(s.charAt(i) == 'l' || s.charAt(i) == 'n'){
					if(s.charAt(i+1) == 'j') {
						i++;
						continue;
					}
				}
				else if(s.charAt(i) == 's' || s.charAt(i) == 'z'){
					if(s.charAt(i+1) == '=') {
						i++;
						continue;
					}
				}
			}
		}
		
		System.out.print(cnt);
	}
}