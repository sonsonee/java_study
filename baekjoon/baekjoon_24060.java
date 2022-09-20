import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_24060 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int K;
    static int[] A;
    static int[] tmp;
    static int count = 0;
    static int K_num = -1;

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        merge_sort(A, 0, N-1);

        System.out.println(K_num);

    }

    static void merge_sort(int[] A, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            merge_sort(A, left, mid);    // 전반부 정렬
            merge_sort(A, mid+1, right);  // 후반부 정렬
            merge(A, left, mid, right);      // 병합
        }
    }
    
    static void merge(int[] A, int left, int mid, int right) {
        int i = left;
        int j = mid+1;
        int k = left;

        while(i <= mid && j <= right) {
            if(A[i] <= A[j]) {
                tmp[k++] = A[i++];
            } else {
                tmp[k++] = A[j++];
            }
        }
        
        if(i > mid) {
            for(int l = j; l <= right; l++) 
                tmp[k++] = A[l];
        } else {
            for(int l = i; l <= mid; l++) 
                tmp[k++] = A[l];            
        }

        for(int l = left; l <= right; l++) {
            A[l] = tmp[l];
            count++;
            if(count == K) { 
                K_num = tmp[l]; 
            }
            
        }
    }
}