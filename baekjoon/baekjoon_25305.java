import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon_25305 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] scores = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores, Comparator.reverseOrder()); // 내림차순 정렬

        System.out.println(scores[k-1]);
    }
}