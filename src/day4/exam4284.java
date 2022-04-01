package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class exam4284 {
    //이동을 위한 함수
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] inputs;
    static int[] apartments = new int[12*25];
    static boolean[][] visited;
    static int n;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        n = Integer.parseInt(br.readLine());
        inputs = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            for (int j = 0; j < n; j++) {
                inputs[i][j] = str.charAt(j) - '0';
            }
        }

        cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(inputs[i][j]==1 && !visited[i][j]){
                    cnt++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(cnt);
        Arrays.sort(apartments);
        for(int i:apartments){
            if(i==0) continue;
            else System.out.println(i);
        }


    }

    public static void dfs(int i, int j){
        visited[i][j] = true;
        apartments[cnt]++;

        for(int k=0; k<4; k++){
            int newI = i+dx[k];
            int newJ = j+dy[k];
            if(newI>=0 && newJ>=0 && newI<n && newJ<n){
                if(inputs[newI][newJ]==1 && !visited[newI][newJ]){
                    dfs(newI, newJ);
                }
            }
        }
    }
}
