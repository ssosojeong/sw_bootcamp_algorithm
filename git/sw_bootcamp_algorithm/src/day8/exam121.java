package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class exam121 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        int back = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                queue.offer(x);
                back = x;
            }
            if (str.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                    continue;
                }
                int x = queue.poll();
                sb.append(x + "\n");
            }
            if (str.equals("size")) {
                int x = queue.size(); // queue에 들어있는 원소의 개수를 x에 저장합니다.
                sb.append(x + "\n");
            }
            if (str.equals("empty")) {
                Boolean isEmpty = queue.isEmpty();
                if (isEmpty)
                    sb.append("1\n");
                else
                    sb.append("0\n");
            }
            if (str.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                    continue;
                }
                int x = queue.peek(); // 큐에 가장 먼저 들어간 값을 x에 저장합니다.
                sb.append(x + "\n");
            }
            if (str.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                    continue;
                }
                int x = back;
                sb.append(x + "\n");
            }
        }
        System.out.println(sb);
    }
}
