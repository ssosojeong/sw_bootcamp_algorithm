package day3;

import java.io.*;
import java.util.*;

public class exam767{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        //입력값 받기
        int[][] inputs = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            inputs[i][0] = Integer.parseInt(st.nextToken());
            inputs[i][1] = Integer.parseInt(st.nextToken());
        }

        //비교하기
        int rate;
        for(int i=0; i<n; i++){
            rate = 1;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(inputs[i][0]<inputs[j][0] && inputs[i][1]<inputs[j][1]) rate++;
            }
            sb.append(rate).append(" ");
        }
        System.out.print(sb);
    }
}