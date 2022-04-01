package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam4699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int t = Integer.parseInt(br.readLine());
        boolean flag = false;

        //여기서부터 t번 반복되어야 함
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Queue<int[]> fire = new LinkedList<>();
        Queue<int[]> escape = new LinkedList<>();

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int startW = 0;
        int startH = 0;

        int[][] map = new int[h][w];
        for(int i=0; i<h; i++){
            char[] inputs = br.readLine().toCharArray();
            for(int j=0; j<w; j++){
                char tar = inputs[j];
                if(tar=='.') map[i][j] = 0;
                else if(tar=='#') map[i][j] = -1;
                else if(tar=='*') {
                    map[i][j] = 1;
                    fire.offer(new int[]{i, j});
                }
                else if(tar=='@') {
                    map[i][j] = 0;
                    escape.offer(new int[]{i,j});
                }
            }
        }


        //bfs 불
        while(!fire.isEmpty()){
            int[] tar = fire.poll();
            int i = tar[0];
            int j = tar[1];

            for(int k=0; k<4; k++){
                int newI = i + dy[k];
                int newJ = j + dx[k];

                if(newI>=h || newI<0 || newJ>=w || newJ<0) break;

                if(map[newI][newJ] == 0){
                    fire.offer(new int[]{newI, newJ});
                    map[newI][newJ] = map[i][j] + 1;
                }
            }
        }

        print(map);

        int[] start = escape.peek();
        map[start[0]][start[1]] = 1;

        print(map);

        //bfs 경로찾기
        while(!escape.isEmpty()){
            int[] tar = escape.poll();
            int i = tar[0];
            int j = tar[1];

            for(int k=0; k<4; k++){
                int newI = i + dy[k];
                int newJ = j + dx[k];

                if(newI>=h || newJ>=w) break;
                if(newI<0 || newJ<0){
                    flag = true; break;
                }

                if(map[newI][newJ]>map[i][j]+1){
                    escape.offer(new int[]{newI, newJ});
                    map[newI][newJ] = map[i][j]+1;
                }
            }
        }

        System.out.println(flag);
        print(map);



    }

    public static void print(int[][] arr){
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
    }
}
