import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class baekjoon_1158 {

    static StringBuilder result = new StringBuilder();
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        in.close();
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        result.append("<");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < K; j++){
                if(j == K-1){
                    result.append(queue.peek());
                    if(i != N-1) result.append(", ");
                    queue.remove();
                }else{
                    queue.add(queue.peek());
                    queue.remove();
                }
            }
        }
        result.append(">");
        System.out.println(result.toString());
     }

}
