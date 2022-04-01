package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam2782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int input;
        int ans = 0;
        for(int i=0; i<K; i++){
            input = Integer.parseInt(br.readLine());
            if(input==0){
                ans -= stack.pop();
            } else{
                stack.push(input);
                ans += input;
            }
        }
        System.out.println(ans);
    }
}
