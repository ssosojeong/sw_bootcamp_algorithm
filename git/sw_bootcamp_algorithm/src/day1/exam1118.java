package day1;

import java.io.*;
import java.util.StringTokenizer;

public class exam1118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] schedule = new int[1000];
        int[] work = new int[2*n];

        //모든 근무 시간 저장
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start; j<end; j++){
                schedule[j-1] ++;
            }
            work[i*2] = start;
            work[i*2+1] = end;
        }
        //총 근무 시간 구하기
        int total = 0;
        for(int i:schedule){
            if(i>0) total++;
        }

        //해고
        int max = -1;
        for(int i=0; i<n; i++){
            int temp = total;
            int start = work[i*2];
            int end = work[i*2+1];
            for(int j=start; j<end; j++){
                if(schedule[j-1]==1) temp--;
            }
            if(temp>max) max = temp;
        }

        System.out.println(max);

    }
}
