package day3;

import java.io.*;
import java.util.StringTokenizer;

public class exam4095{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //첫줄 입력받기
        int n = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int[] inputs = new int[n];
        int cnt = 0;

        //둘쨋줄 입력
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        //구간 합 체크
        int temp;
        for(int i=0; i<n; i++){
            temp=0;
            for(int j=i; j<n; j++){
                temp+=inputs[j];
                if(temp==sum) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}