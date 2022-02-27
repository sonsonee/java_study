import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_9536 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder result = new StringBuilder();

    static public void main(String[] args) throws IOException{

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){

            String[] crySound = br.readLine().split(" "); // 울음소리 배열

            String line;
            // what does the fox say? 나올 때까지 입력받기
            while((line = br.readLine()) != null){
                if(line.equals("what does the fox say?")) 
                    break;
                    
                String[] animalCry = line.split(" ");
                for(int j = 0; j < crySound.length; j++){
                    if(crySound[j] != null && crySound[j].equals(animalCry[2])) 
                        crySound[j] = null;
                }
            }

            for(int j = 0; j < crySound.length; j++){
                if(crySound[j] != null) result.append(crySound[j]).append(" ");
            }
            result.append("\n");
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}