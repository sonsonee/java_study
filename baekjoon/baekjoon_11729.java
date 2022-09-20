import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_11729 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer= new StringBuilder();

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        
        answer.append((int)Math.pow(2, N)-1).append("\n");
        hanoi(N, 1, 3, 2);

        System.out.print(answer.toString());
    }

    static void hanoi(int N, int start, int to, int via) {
        if(N == 1) {
            move(1, start, to);
        } else {
            hanoi(N-1, start, via, to); // N-1개의 원반을 1에서 3을 거쳐 2로 옮기기
            move(N, start, to);         // N번 원반을 1에서 3으로 옮기기
            hanoi(N-1, via, to, start); // N-1개의 원반을 2에서 1을 거쳐 3으로 옮기기
        }
    }

    static void move(int N, int from, int to) {
        answer.append(from).append(" ").append(to).append("\n");
    }
}