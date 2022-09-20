import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2447 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static char[][] arr;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        
        func(0, 0, N, false);

        for(char[] c : arr) {
            for(char cc : c) {
                answer.append(cc);
            }
            answer.append("\n");
        }

        System.out.println(answer.toString());
    }

    static void func(int x, int y, int N, boolean blank) {

        if(blank) { // 공백 채우기
            for(int i = x; i <= x + N; i++) {
                for(int j = y; j <= y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(N == 1) { //종료조건
            arr[x][y] = '*';
            return;
        }

        int smaller = N / 3;
        int count = 0;
        for(int i = x; i < x + N; i += smaller) {
            for(int j = y; j < y + N; j += smaller) {
                count++;
                if(count == 5 ) {
                    // 공백 처리
                    func(i, j, smaller, true);
                } else {
                    func(i, j, smaller, false);
                }
            }
        }
    }
}