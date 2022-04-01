package ch3_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int ans = 0;
        int temp;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            temp = 10001;
            for(int j=0; j<M; j++) {
                temp = Math.min(Integer.parseInt(st.nextToken()), temp);
            }
            ans = Math.max(temp,ans);
        }
        System.out.println(ans);
    }
}
