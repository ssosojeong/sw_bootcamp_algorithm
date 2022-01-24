package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam4283 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] map = new int[102][102];
    static boolean[][] visited = new boolean[102][102];
    static int n ;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        //구멍을 제외하고 탐색
        dfs(0,0);

        //건초와 맞닿아 있는 부분을 count
        for(int i=0; i<102; i++){
            for(int j=0; j<102; j++){
                if(map[i][j]==1){
                    count(i,j);
                }
            }
        }
        System.out.println(cnt);
    }
    //구멍을 제외하고 탐색
    public static void dfs(int i, int j){
        if(map[i][j]==1 || visited[i][j]){
            return;
        }

        visited[i][j] = true;
        map[i][j] = 2;

        for(int k=0; k<4; k++){
            int newI = i+dx[k];
            int newJ = j+dy[k];
            if(newI >=0 && newI<=101 && newJ>=0 && newJ<=101 && map[newI][newJ] != 1){
                dfs(newI,newJ);
            }
        }
    }

    //맞닿은 부분을 탐색
    public static void count(int i, int j){
        for(int k=0; k<4; k++){
            int newI = i+dx[k];
            int newJ = j+dy[k];
            if(map[newI][newJ] == 2){
                cnt++;
            }
        }
    }
}
