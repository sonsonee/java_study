import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_2578 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] bingo = new int[5][5];
    static boolean[][] check = new boolean[5][5];

    public static void main(String[] args) throws IOException {

        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        outer:
        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                cnt++;
                int key = Integer.parseInt(st.nextToken());
                checkBingo(key);
                if(lineCheck()) {
                    System.out.println(cnt);
                    break outer;
                }
            }
        }
    }

    static void checkBingo(int key){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(bingo[i][j] == key){
                    check[i][j] = true;
                    return;
                }
            }
        }
    }

    static boolean lineCheck() {

        int cnt = 0;

        for(int i = 0; i < 5; i++){
            int innercnt = 0;
            for(int j = 0; j < 5; j++){
                if(check[i][j]) innercnt++;
            }
            if(innercnt == 5) cnt++;
        }

        for(int i = 0; i < 5; i++){
            int innercnt = 0;
            for(int j = 0; j < 5; j++){
                if(check[j][i]) innercnt++;
            }
            if(innercnt == 5) cnt++;
        }

        int innercnt = 0;
        for(int i = 0; i < 5; i++){
            if(check[i][i]) innercnt++;
        }
        if(innercnt == 5) cnt++;

        innercnt = 0;
        for(int i = 0; i < 5; i++){
            if(check[i][4-i]) innercnt++;
        }
        if(innercnt == 5) cnt++;

        if(cnt >= 3) return true;
        else return false;
    }
}
