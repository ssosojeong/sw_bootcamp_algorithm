package day8;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        String command;
        while(true){
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            if(command.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
                sb.append(x + "\n");
            }
            if(command.equals("pop")){
                if(stack.isEmpty()){
                    sb.append(-1 + "\n");
                    continue;
                }
                int x = stack.pop();
                sb.append(x + "\n");
            }
            if(command.equals("size")){
                int x = stack.size();
                sb.append(x+"\n");
            }
            if(command.equals("empty")){
                if(stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
            if (command.equals("top")) {
                if(stack.isEmpty()) {
                    sb.append("-1\n");
                    continue;
                }
                int x = stack.peek();
                sb.append(x + "\n");
            }
            if(command.equals("end")) break;
        }
        System.out.println(sb);
    }
}
