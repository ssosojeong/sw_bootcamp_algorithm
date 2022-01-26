package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while(queue.size()!=0){
            for(int i=0; i<M-1; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + " ");
        }
        System.out.println(sb);
    }
}
