package day12;

import java.util.*;
import java.io.*;

public class exam7569_boj{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] di = {1,0,-1,0};
        int[] dj = {0,1,0,-1};

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] inputs = new int[N+1][M+1];
        int[][] rounds = new int[N+1][M+1];
        Queue<int[]> queue = new LinkedList<>();

        //input 받고 처음 토마토 위치를 queue에 저장
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=M; j++){
                int tar = Integer.parseInt(st.nextToken());
                inputs[i][j] = tar;
                if(tar==1){
                    queue.offer(new int[] {i,j});
                    rounds[i][j] = 1;
                }
            }
        }

        for(int i=0; i<=N; i++){
            for(int j=0; j<=M; j++){
                System.out.print(inputs[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<=N; i++){
            for(int j=0; j<=M; j++){
                System.out.print(rounds[i][j] + " ");
            }
            System.out.println();
        }

        //bfs ->
        int ans = 0;
        while(!queue.isEmpty()){
            int[] tar = queue.poll();
            int i = tar[0];
            int j = tar[1];

            //네 방향으로 탐색하기
            for(int k=0; k<4; k++){
                int newI = i + di[k];
                int newJ = i + dj[k];

                //만약 범위를 초과하거나 토마토를 놓을 수 없는 자리(-1이거나 이미 놓인 자리)라면 continue
                if(newI<1 || newI>N || newJ<1 || newJ>M) continue;

                //그게 아니면, [newI][newJ]에 몇번째에 도착했는지 적고, 큐에 새로 넣기
                if(inputs[i][j] == 1 && rounds[newI][newJ] == 0){
                    ans = Math.max(ans, rounds[i][j]+1);
                    rounds[newI][newJ] = rounds[i][j] + 1;
                    queue.offer(new int[] {newI,newJ});
                }
            }
        }

        for(int i=0; i<=N; i++){
            for(int j=0; j<=M; j++){
                System.out.print(rounds[i][j] + " ");
            }
            System.out.println();
        }


        boolean bl = true;
        for(int i = 0; i <= N; i++){
            for (int j = 0 ; j <= M; j++){
                if(inputs[i][j] ==1 && rounds[i][j] == 0) {
                    bl = false;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (bl == false)
            sb.append(-1+ "\n");
        else
            sb.append((ans - 1) + "\n");
        System.out.println(sb);
    }
}