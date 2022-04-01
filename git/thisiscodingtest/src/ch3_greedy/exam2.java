package ch3_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] inputs = new int[N];
        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputs);

        int first = inputs[N-1];
        int second = inputs[N-2];
        int ans = 0;

        while(M>0){
            for(int i=0; i<K; i++){
                if(M==0) break;
                ans += first;
                M -= 1;
            }
            if(M>0){
                ans += second;
                M -= 1;
            }
        }
        System.out.println(ans);

    }
}
