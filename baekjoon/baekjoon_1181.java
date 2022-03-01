import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon_1181 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException{
        
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        int index = 0;
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            if(!Arrays.asList(arr).contains(s)){
                arr[index++] = s;
            }
        }
        br.close();

        for(int i = 0; i < index-1; i++){
            for(int j = i + 1; j < index; j++){
                if(arr[i].length() > arr[j].length()){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else if(arr[i].length() == arr[j].length()){
                    if(arr[i].compareTo(arr[j]) > 0){
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        for(int i = 0; i < index; i++){
            result.append(arr[i]).append("\n");
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}
