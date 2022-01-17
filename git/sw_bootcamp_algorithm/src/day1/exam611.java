package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam611 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] intArr = new int[100];

        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start= Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start; j<end; j++){
                intArr[j-1] ++;
            }
        }

        int cnt = 0;
        for(int i:intArr){
            switch(i){
                case(1) : cnt+=a; break;
                case(2) : cnt+=b*2; break;
                case(3) : cnt+=c*3; break;
            }
        }

        System.out.println(cnt);

    }
}
