import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_10974 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static boolean[] isVisited = new boolean[9];
    static ArrayList<Integer> arr = new ArrayList<>();
    static int N;

    public static void main(String[] args) throws IOException {
        
        N = Integer.parseInt(br.readLine());

        func();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void func() {
        if(arr.size() == N) { //종료조건
            for(int i = 0; i < N; i++) {
                sb.append(arr.get(i)).append(" ");
            }
            sb.append("\n");
            return;
        } 
        else {
            for(int i = 1; i <= N; i++) {
                if(isVisited[i] == false) {
                    isVisited[i] = true;
                    arr.add(i);
                    func();
                    isVisited[i] = false;
                    arr.remove(arr.size() - 1);
                }
            }
        }

    }
}
