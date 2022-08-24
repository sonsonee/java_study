import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1546 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        float max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if(max < scores[i]) max = scores[i];
        }

        float[] manipulated = new float[N];
        float m_total = 0;

        for(int i = 0; i < N; i++) {
            manipulated[i] = (scores[i] / max) * 100;
            m_total += manipulated[i];
        }

        System.out.println((m_total / N));
    }
}