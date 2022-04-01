package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam482 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] polars = new String[n];
        int[] cookies = new int[n];

        //값 받으며 비교하기q
        int val = 0;
        int cnt = 0;
        String input;
        for(int i=0; i<n; i++){
            input = br.readLine();
            val = 0;
            for(int j=0; j<n; j++){
                if(polars[j]==null){
                    polars[j] = input;
                    cookies[j]++;
                    break;
                } else if(polars[j].equals(input)){
                    val = cookies[j];
                    cookies[j]++;
                    break;
                }
            }
            //쿠키 비교
            if(val>i/2) cnt++;
        }
        System.out.println(cnt);
    }
}