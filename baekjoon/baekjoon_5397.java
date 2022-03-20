import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class baekjoon_5397 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String s = br.readLine();
            LinkedList<Character> password = new LinkedList<>();
            int cursor = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '<'){
                    if(cursor > 0) cursor--;
                } else if(s.charAt(j) == '>'){
                    if(password.size() > cursor) cursor++;
                } else if(s.charAt(j) == '-'){
                    if(cursor > 0){
                        password.remove(cursor-1);
                        cursor--;
                    }
                } else {
                    password.add(cursor++, s.charAt(j));
                }
            }

            for(Character c:password){
                result.append(c);
            }
            result.append('\n');
        }
        br.close();
        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}