package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam783{
    static int[] visited;
    static int N, P, ans;

    public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine()," ");

     N = Integer.parseInt(st.nextToken());
     P = Integer.parseInt(st.nextToken());

     visited = new int[N+1];

     dfs(N,1);
     System.out.println(ans);

    }

    public static void dfs(int rest, int cnt){
        if(visited[rest] == 0){
            visited[rest] = cnt;
            dfs( rest*N%P, cnt+1 );
        } else{
            ans = cnt-visited[rest];
        }
    }


}

