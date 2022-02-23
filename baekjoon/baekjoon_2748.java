import java.util.Scanner;

class baekjoon_2748{

    static long[] p;
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            p = new long[n + 1];

            p[0] = 0;
            p[1] = 1;

            for(int i = 2; i <= n; i++){
                p[i] = p[i-1] + p[i-2];
            }

            System.out.println(p[n]);
        }
    }
}