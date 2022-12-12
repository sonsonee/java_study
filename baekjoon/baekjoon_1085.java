import java.io.*;

public class baekjoon_1085 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int w = Integer.parseInt(s[2]);
        int h = Integer.parseInt(s[3]);

        int answer = Math.min(x, Math.min(y, Math.min(h-y, w-x)));
        System.out.println(answer);

        return;
    }
}