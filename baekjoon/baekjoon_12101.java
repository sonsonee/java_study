import java.util.*;
import java.io.*;

class baekjoon_12101 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<String> list = new ArrayList<>();

    public static String solution(int n, int k) {
        String answer = "";

        String tmp = "";
        dfs(n, 0, tmp);

        Collections.sort(list);
        if(list.size() >= k)
            answer = list.get(k-1);
        else return "-1";

        return answer.substring(0, answer.length()-1);
    }

    public static void dfs(int n, int sum, String s) {
        if(sum == n) {
            list.add(s);
            return;
        } 

        if(sum > n) return;

        for(int i = 1; i <= 3; i++) {
            dfs(n, sum+i, s + i + "+");
        }
    }

    public static void main(String[] args) throws IOException {

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        br.close();

        System.out.println(solution(n, k));
    }
}