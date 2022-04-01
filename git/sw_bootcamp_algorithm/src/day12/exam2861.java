package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam2861 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int[] check = new int[200001];

        Queue<Integer> queue = new LinkedList<>();

        //초기값 지정
        check[X] = 1;
        queue.offer(X);

        //bfs 시작 -> 각 타겟값에 대해 a+1, a-1, a*2 를 구하여 거기서부터 새로 시작하도록
        //하지만 어떤 수를 만들어도 최대값(20만)을 넘어선 안됨
        //if 조건 순서 바뀌면 arrayoutofindex 에러
        while(!queue.isEmpty()){
            int tar = queue.poll();
            if(tar+1<200001 && check[tar+1]==0){
                check[tar+1] = check[tar]+1;
                queue.offer(tar+1);
            }
            if(tar-1>=0 && check[tar-1]==0){
                check[tar-1] = check[tar]+1;
                queue.offer(tar-1);
            }
            if(tar*2<200001 && check[tar*2]==0){
                check[tar*2] = check[tar]+1;
                queue.offer(tar*2);
            }
        }
        System.out.println(check[Y]-1);

    }
}