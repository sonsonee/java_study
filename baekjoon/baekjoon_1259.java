import java.io.*;

public class baekjoon_1259 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        
        String s = br.readLine();
        while(!s.equals("0")) {
            StringBuilder tmp = new StringBuilder();
            for(int i = s.length()-1; i >=0; i--) {
                tmp.append(s.charAt(i));
            }

            if(tmp.toString().equals(s)) answer.append("yes").append("\n");
            else answer.append("no").append("\n");

            s = br.readLine();
        }

        System.out.println(answer.toString());
    }
}