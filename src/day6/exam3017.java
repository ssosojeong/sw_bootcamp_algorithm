package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam3017 {
    static boolean[] check;
    static int cnt, N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        check = new boolean[N+1];

        cnt = 0;
        dfs(1, cnt);

        System.out.print(sb);

    }

    public static void dfs(int start, int cnt){
        if(cnt==M){
            for(int i=1; i<=N; i++){
                if(check[i]) sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        cnt++;
        for(int i=start; i<=N; i++){
            check[i] = true;
            dfs(i+1, cnt);
            check[i] = false;
        }
    }
}
