package day10;

import java.util.*;
import java.io.*;

public class main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] inputs = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                int tar = Integer.parseInt(st.nextToken());
                inputs[i][j] = tar;
                if(tar==1) queue.offer(new int[]{i, j});
            }
        }

        for(int i=0; i<2; i++){
            System.out.println(queue.poll().toString());
        }
    }
}
