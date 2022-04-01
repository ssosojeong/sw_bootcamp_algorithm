package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam4489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] inputs = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());

        int ans;
        int sum = 0;
        int check = -1;
        //체크포인트 찾기
        while(sum<=M){
            check++;
            sum += inputs[check];
        }
        ans = N-check;

        //하나씩 하기
        for(int i=1; i<N; i++){
            sum -= inputs[i-1];
            while(sum<=M && check<N-1){
                check++;
                sum+=inputs[check];
            }
            ans += N-check;
            if(check==N-1){
                break;
            }
        }

        System.out.println(ans);
    }
}
