import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class baekjoon_2204{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) throws IOException {
        
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            
            String[] words = new String[N];
            String[] upper = new String[N];
            for(int i = 0; i < N; i++){
                words[i] = br.readLine();
                upper[i] = words[i].toUpperCase();
            }

            String ans = words[0];
            for(int i = 1; i < N; i++){
                if(upper[i].compareTo(ans.toUpperCase()) < 0) ans = words[i];
            }

            result.append(ans).append('\n');
        }
        
        System.out.println(result.toString());
    }
}