package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class examArrDfs {
    //이동을 위한 함수
    static int[] dy = {0,-1,0,1};
    static int[] dx = {-1,0,1,0};
    static int[][] intArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        intArr = new int[5][5];
        StringTokenizer st;

        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<5; j++){
                intArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void dfs(int x, int y){
        int mx=0;
        int my=0;
        for(int i=0; i<4; i++){
            mx = x+dx[i];
            my = y+dy[i];
            if(my>=0 && mx>=0 && my<5 && mx<5 && intArr[my][mx]==1){
                intArr[my][mx] = 2;
            }

        }
    }
}
