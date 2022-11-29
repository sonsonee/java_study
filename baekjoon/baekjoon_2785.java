import java.io.*;
import java.util.*;

public class baekjoon_2785 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        int n = Integer.parseInt(br.readLine());
        int[] len = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            len[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(len); // 오름차순 정렬

        int needChain = n-1;
        int count = 0;

        for(int l : len) {
            if(l <= needChain-1) {
                needChain -= l + 1;
                count++;
            } else {
                break;
            }
        }

        System.out.println(n - 1 - count);
    }
}