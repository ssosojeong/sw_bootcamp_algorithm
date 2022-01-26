package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<input.length; i++){
            if(input[i]=='('){
                stack.push(1);
            }
            else{
                if(stack.isEmpty()){
                    stack.push(0);
                    System.out.println(":(");
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.size()==0) System.out.println(":)");
    }
}
