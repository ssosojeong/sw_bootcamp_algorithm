package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam2793 {
    static int N, M;
    static ArrayList<ArrayList<Integer>> map;
    static boolean[] visit;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new ArrayList<>();
        visit = new boolean[N+1];

        for(int i=0; i<=N; i++){
            map.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map.get(a).add(b);
            map.get(b).add(a);
        }

        cnt = 0;
        dfs(1);
        if(cnt==N-1){
            System.out.println(0);
        } else{
            for(int i=1; i<=N; i++){
                if(!visit[i]) System.out.println(i);
            }
        }
    }

    public static void dfs(int x){
        visit[x] = true;
        for(int i : map.get(x)){
            if(!visit[i]){
                cnt++;
                dfs(i);
            }
        }
    }

}