import java.io.*;
import java.util.*;

public class baekjoon_18870 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        Integer[] tmp = new Integer[N]; // 임시 배열

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(st.nextToken());
            tmp[i] = X[i];
        }
        
        tmp = Arrays.stream(tmp).distinct().toArray(Integer[]::new); //중복 제거
        Arrays.sort(tmp); // 정렬

        for(int x : X) {
             
             int start = 0;
             int end = tmp.length - 1;

            // 이분 탐색
            while(start <= end) {
                int mid = (start + end) /2;
                if(tmp[mid] == x) {
                    answer.append(mid).append(" ");
                    break;
                } else if(tmp[mid] > x) end = mid - 1;
                else start = mid + 1;
            }
        }
        answer.append("\n");
        System.out.println(answer.toString());
    }
}