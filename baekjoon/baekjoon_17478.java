import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_17478 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder answer = new StringBuilder();

    static String Q = "\"재귀함수가 뭔가요?\"\n";
    static String A1 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
    static String[] A2 = {"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
                            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
                            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"};
    static String A3 = "라고 답변하였지.\n";

    public static void main(String[] args) throws IOException {
        
        int n = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursive(n, 0);
        System.out.print(answer.toString());
    }

    static void recursive(int n, int m) {
        if(n == 0) {
            for(int i = 0; i < m; i++) answer.append("____");
            answer.append(Q);
            for(int i = 0; i < m; i++) answer.append("____");
            answer.append(A1);
            for(int i = 0; i < m; i++) answer.append("____");
            answer.append(A3);
            return;
        } else {
            for(int i = 0; i < m; i++) answer.append("____");
            answer.append(Q);
            for(int i = 0; i < m; i++) answer.append("____");
            answer.append(A2[0]);
            for(int i = 0; i < m; i++) answer.append("____");
            answer.append(A2[1]);
            for(int i = 0; i < m; i++) answer.append("____");
            answer.append(A2[2]);
        }

        recursive(n-1, m+1);
        for(int i = 0; i < m; i++) answer.append("____");
        if(n == 0) answer.append("라고 답변하였지.");
        else answer.append(A3);
    }
}