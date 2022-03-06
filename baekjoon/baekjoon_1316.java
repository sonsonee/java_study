import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(N-- > 0){
            String s = br.readLine();
            int[] alphabet = new int[26];
            Arrays.fill(alphabet, -1);
            boolean result = true;

            // 단어 길이가 3을 넘지 않으면 무조건 그룹 단어
            if(s.length() < 3) {
                count++;
                continue;
            }

            for(int i = 0; i < s.length() - 1; i++){
                if(alphabet[s.charAt(i) - 'a'] == -1) // i번째 알파벳이 등장한 적 없으면
                    alphabet[s.charAt(i) - 'a'] = i;   // 처음 등장한 인덱스 저장
                if(s.charAt(i) != s.charAt(i+1)){  // 현재 알파벳이 다음 알파벳이랑 다르고
                    if(alphabet[s.charAt(i+1) - 'a'] != -1){ // 등장한 적이 있으면
                        result = false;                     // 그룹 단어가 아님
                        break;
                    }
                }
            }

            if(result) count++;
        }

        br.close();
        System.out.println(count);
    }
}
