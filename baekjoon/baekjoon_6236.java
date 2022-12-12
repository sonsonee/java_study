import java.io.*;

//TODO: 문제 마저 풀기
public class baekjoon_6236 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int solution(int n, int m, int[] q) {

        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += q[i];
            if(max < q[i]) max = q[i];
        }

        return binarySearch(max, sum, n, m, q);
    }


    public static int binarySearch(int lo, int hi, int n, int m, int[] q) {

        int mid = lo + hi / 2;
        for(int i = 0; i < n; i++) {
            if(q[i] < mid) {    // 지출액보다 출금액이 크면
                
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] q = new int[n];

        for(int i = 0; i < n; i++) 
            q[i] = Integer.parseInt(br.readLine());

        br.close();

        System.out.print(solution(n, m, q));
    }
}
