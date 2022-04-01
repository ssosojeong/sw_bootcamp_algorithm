package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a<0 || b<0 || a>90 || b>90){
            System.out.println(-1);
        } else{
            System.out.printf("LH %d %d\n", a, b+10);
            System.out.printf("LL %d %d\n", a, b);
            System.out.printf("RH %d %d\n", a+10, b+10);
            System.out.printf("RL %d %d\n", a+10, b);
        }
    }
}
