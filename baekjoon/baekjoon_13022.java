import java.io.*;

public class baekjoon_13022 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder compare = new StringBuilder();

    public static boolean solution(String s) {

        int len = s.length();
        char[] wolf = {'w', 'o', 'l', 'f'};
        int[] w_cnt = new int[15];

        if(s.charAt(0) == 'w') w_cnt[0] = 1;

        int index = 0;
        for(int i = 1; i < len; i++) {
            if(s.charAt(i) == 'w') {
                if(s.charAt(i-1) == 'f') {  // 새로운 단어 시작
                    w_cnt[++index]++;
                } else {    
                    w_cnt[index]++;
                }
            }
        }

        // for(int i : w_cnt) System.out.println(i);

        for(int i = 0; i < 15; i++) {
            if(w_cnt[i] == 0) break;
            for(int k = 0; k < 4; k++) {
                for(int j = w_cnt[i]; j > 0; j--) 
                    compare.append(wolf[k]);
            }
        } 

        if(compare.toString().equals(s)) return true;
        else return false;
    }

    public static void main(String[] args) throws IOException {
        
        String s = br.readLine();
        br.close();

        if(solution(s)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}