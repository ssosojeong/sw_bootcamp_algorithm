package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam2861 {
    static int[] inputs;
    static int N;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        inputs = new int[N];

        dfs(0);
        System.out.println(ans);
    }

    public static void dfs(int depth){
        if(depth==N){
            ans++;
            return;
        }
        for(int i=0; i<N; i++){
            //inputs[depth] = i;
            if(check(depth, i)){
                inputs[depth] = i;
                dfs(depth+1);
            }
        }
    }

    public static boolean check(int x, int y){
        for(int j=0; j<x; j++){
            //행 검사
            if(inputs[j] == y){
                return false;
            }
            //대각선 검사
            if(Math.abs(j-x)==Math.abs(inputs[j]-y)){
                return false;
            }
        }
        return true;
    }
}
