import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_9996 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException{

        int N = Integer.parseInt(br.readLine());
        String[] format = br.readLine().split("\\*");
        int length1 = format[0].length();
        int length2 = format[1].length();

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            if(s.length() < length1 + length2) {
                result.append("NE").append("\n");
                continue;
            }

            String s1 = s.substring(0, length1);
            String s2 = s.substring(s.length() - length2);
            
            if(format[0].equals(s1)){
                if(format[1].equals(s2)){
                    result.append("DA").append("\n");
                    continue;
                }
            }

            result.append("NE").append("\n");
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}