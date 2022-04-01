package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam3016 {
    static boolean[] check;
    static int[] ans;
    static int cnt, N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        check  = new boolean[N+1];
        ans = new int[N+1];
        cnt = 0;

        dfs(cnt);

        System.out.print(sb);
    }

    public static void dfs(int cnt){
        if(cnt==M){
            for(int i=1; i<=cnt; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        cnt++;
        for(int i=1; i<=N; i++){
            if(!check[i]){
                check[i] = true;
                ans[cnt] = i;
                dfs(cnt);
                check[i] = false;
            }
        }
    }
}
