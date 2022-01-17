package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam556 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int students = Integer.parseInt(st.nextToken());
        boolean flag = false;

        for(int i=0; i<=50; i++){
            for(int j=0; j<=50; j++){
                for(int k=0; k<=50; k++){
                    if(a*i + b*j + c*k == students){
                        flag = true;
                    }
                }
            }
        }
        System.out.println(flag? 1:0);
    }
}
