package day4;

import java.io.*;
import java.util.*;

public class exam877 {
    static ArrayList<ArrayList<Integer>> graphicList;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graphicList = new ArrayList<>();
        visited = new boolean[n+1];

        //input
        for(int i=0; i<n+1; i++){
            graphicList.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graphicList.get(a).add(b);
            graphicList.get(b).add(a);
        }

        //1번부터 시작하여 노드(컴퓨터)를 방문
        dfs(1);
        //방문된 컴퓨터 수 세기(2번 컴퓨터 부터)
        int cnt=0;
        for(int i=2; i<n+1; i++){
            if(visited[i]) cnt++;
        }
        System.out.println(cnt);
    }

    public static void dfs(int start){
        visited[start] = true;
        for(int i: graphicList.get(start)){
            if(visited[i]==false){
                dfs(i);
            }
        }
    }
}
