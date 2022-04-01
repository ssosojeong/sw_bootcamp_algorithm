package mid;

import java.io.*;
import java.util.StringTokenizer;

public class exam4886 {
    public static char[][] inputs;
    public static boolean[][] visit;
    public static int N, M;
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        inputs = new char[N][M];
        visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine().toCharArray();
        }

        //outer side 탐색 시작
        for (int j = 0; j < M; j++) {
            if (inputs[0][j] == '0') {
                visit[0][j] = true;
                dfs(0, j);
            }
        }
        boolean pos = false;
        //만약 inenr side 중 한 칸이라도 visit가 true면 가능한 것
        for (int j = 0; j < M; j++) {
            if (visit[N - 1][j]) pos = true;
        }
        System.out.println(pos ? "YES" : "NO");
    }


        //dfs 함수
        public static void dfs(int i, int j){
            //네 방향 탐색
            for(int k=0; k<4; k++){
                int newI = i+dy[k];
                int newJ = j+dx[k];
                if(newI>=0 && newJ>=0 && newI<N && newJ<M && !visit[newI][newJ] && inputs[newI][newJ]=='0'){
                    visit[i][j] = true;
                    dfs(newI, newJ);
                }
            }
        }

}