package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam352 {
    public static int[] check;
    public static int N;
    public static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        check = new int[N];

        dfs(0);
        System.out.println(ans);
    }

    //열에 특정 행에 놓을 수 있는지 검사하는 재귀함수
    public static void dfs(int depth){
        //만약 모든 열에 행을 할당하면 ans를 증가시킴
        if(depth==N){
            ans++;
            return;
        }

        //아직 모든 열에 행이 할당되지 않았다면 행에 열 값을 부여한뒤 검사함
        for(int i=0; i<N; i++){
            check[depth] = i;
            if(checkPosibility(depth)){
                dfs(depth+1);
            }
        }
    }

    //가능여부 검사
    public static boolean checkPosibility(int col){
        //검사할 열의 직전 열(이미 정해진)까지만 검사하면 됨
        for(int i=0; i<col; i++){
            // 검사할 열의 행과 i열의 행이 일치하면 불가능함(한 행엔 한 퀸만 가능하므로)
            if(check[col] == check[i]){
                return false;
            }
            // 대각선 검사
            // 검사할 열과 행 값의 합 또는 차가 i열 행 값의 합 또는 차와 같아선 안됨
            else if(Math.abs(col-i) == Math.abs(check[col]-check[i])){
                return false;
            }
        }
        return true;
    }

}
