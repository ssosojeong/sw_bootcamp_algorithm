package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam4313 {
    static ArrayList<ArrayList<Integer>> list, backList;
    static int N;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        backList = new ArrayList<>();

        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
            backList.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            backList.get(b).add(a);
        }



        int ans = 0;
        for(int i=1; i<N+1; i++){
            visited = new boolean[N+1];
            int taller = dfs(i);
            int smaller = dfsReverse(i);
            if(taller+smaller-2 == N-1) ans++;
        }
        System.out.println(ans);

    }
    public static int dfs(int a){
        cnt = 1;
        visited[a] = true;
        for(int node:list.get(a)){
            if(!visited[node]){
                cnt+=dfs(node);
            }
        }
        return cnt;
    }
    public static int dfsReverse(int a){
        cnt = 1;
        visited[a] = true;
        for(int node:backList.get(a)){
            if(!visited[node]){
                cnt+=dfsReverse(node);
            }
        }
        return cnt;
    }
}
