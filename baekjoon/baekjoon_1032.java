import java.io.*;

class baekjoon_1032{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder result;
    public static void main(String[] args) throws IOException{

        String s = br.readLine();
        int N = Integer.parseInt(s);
        String[] arr = new String[N];
    
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        result = new StringBuilder();
        for(int i = 0; i < arr[0].length(); i++){
            boolean check = true;
            for(int j = 0; j < N - 1; j++){
                if(arr[j].charAt(i) != arr[j+1].charAt(i)){
                    check = false;
                }
            }
            
            if(check) result.append(arr[0].charAt(i));
            else result.append('?');
        }

        System.out.print(result.toString());
    }
}