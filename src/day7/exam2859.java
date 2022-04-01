package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam2859 {
    static int N, M;
    static int[] price;
    static int depth;
    static int max;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        price = new int[M];
        for(int i=0; i<M; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }

        max = -1;
        depth = 0;
        sum = 0;
        dfs(depth, sum);
        System.out.println(max);
    }

    public static void dfs(int depth, int sum){
        if(depth==M-1){
            if(sum>max) max = sum;
            return;
        }

        if(sum+price[depth]<=N){
            dfs(depth+1, sum+price[depth]);
        }
        dfs(depth+1, sum);

//        for(int i=0; i<2; i++){
//            //포함되면
//            if(i==1){
//                //근데 N원을 초과하면
//                if(sum+price[depth]>N) continue;
//                //N원을 초과하지 않으면 일단 더해줌
//                else sum += price[depth];
//                //하위탐색 후
//                dfs(depth+1);
//                //다시 빼줌
//                sum -= price[depth];
//            }
//            //포함되지 않으면 더하고 빼줄 게 없음
//            dfs(depth+1);
//        }

        /*
        시간은 아래 경우가 훨씬 짧음!
         */
    }

}