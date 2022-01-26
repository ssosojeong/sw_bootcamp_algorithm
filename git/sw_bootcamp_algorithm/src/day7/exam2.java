package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam2 {
    static int[][] inputs;
    static int N;
    static int money;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        inputs = new int[2][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            //T 입력
            inputs[0][i] = Integer.parseInt(st.nextToken());
            //P 입력
            inputs[1][i] = Integer.parseInt(st.nextToken());
        }
        int day = -1;

        for(int i=0; i<N; i++){
            money = 0;
        }


    }
    public static void dfs (int day){
        if(day>=7){
            return;
        }

        for(int i=day; i<N; i++){
            day+=inputs[0][i];
            money+=inputs[1][i];
            dfs(day);
            day++;

        }

    }

}