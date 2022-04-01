package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam4315 {
    static int N, M;
    static int[][] cheese;
    static boolean[][] visit;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cheese = new int[N][M];
        visit = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                cheese[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean flag = true;
        int ans = 0;
        while(flag){
            ans++;
            flag = false;

            //치즈 바깥 부분을 갱신
            //visit = new boolean[N][M];
            searchOutside(ans-1,ans-1);
            printArr(visit);
            System.out.println();

            //치즈가 있는 곳 찾고 녹이고
            for(int i=1; i<N-1; i++){
                for(int j=1; j<M-1; j++){
                    if(cheese[i][j]==1) {
                        flag = true;
                        changeCheese(j,i);
                    }
                }
            }
            printArr(cheese);
            System.out.println();
        }
        System.out.println(ans-1);


    }

    public static void searchOutside(int x, int y){
        if(cheese[y][x]==1 || visit[y][x]){
            return;
        }
        visit[y][x] = true;
        cheese[y][x] = 2;
        for(int k=0; k<4; k++){
            int nY = y+dy[k];
            int nX = x+dx[k];
            if(nY>=0 && nY<N && nX>=0 && nX<M && cheese[nY][nX]!=1){
                searchOutside(nX, nY);
            }
        }
    }

    public static void changeCheese(int x, int y){
        int cnt = 0;

        for(int k=0; k<4; k++){
            int nY = y+dy[k];
            int nX = x+dx[k];
            if(visit[nY][nX]) cnt++;
        }

        if(cnt>=2) cheese[y][x] = 2;
    }

    public static void printArr(int[][] intArr){
        for(int i=0; i<intArr.length; i++){
            for(int j=0; j<intArr[0].length; j++){
                System.out.print(intArr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void printArr(boolean[][] intArr){
        for(int i=0; i<intArr.length; i++){
            for(int j=0; j<intArr[0].length; j++){
                System.out.print(intArr[i][j]+ " ");
            }
            System.out.println();
        }
    }

}