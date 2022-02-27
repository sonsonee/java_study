import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_4779 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException{

        String line;
        // 입력이 종료될 때까지 받음
        while((line = br.readLine()) != null){

            int N = Integer.parseInt(line);
            
            String s = recursive(N, true);
            result.append(s).append('\n');
        }
        
        bw.write(result.toString());
        bw.flush();
        bw.close();
    }

    // b : 중간 배열-false, 양 끝-true
    public static String recursive(int N, boolean b){
        // 종료 조건
        if(b == false){
            StringBuilder s = new StringBuilder();
            for(int i = 0; i < (int) Math.pow(3, N); i++){
                s.append(" ");
            }
            return s.toString();
        }
        else{
            if(N == 0) return "-";
            // 종료
            return recursive(N-1, true) + recursive(N-1, false) + recursive(N-1, true);
        }
    }
}
