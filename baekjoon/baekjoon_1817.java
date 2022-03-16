import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1817 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer[] book = new Integer[N];

        int cnt;
        if(N != 0){
            st = new StringTokenizer(br.readLine());
            
            cnt = 1;
            int box = 0;
    
            for(int i = 0; i < N; i++){
                book[i] = Integer.parseInt(st.nextToken());
                if(box + book[i] > M){
                    cnt++;
                    box = book[i];
                } else {
                    box += book[i];
                }
            }
        } else{
            cnt = 0;
        }

        System.out.println(cnt);
    }
}