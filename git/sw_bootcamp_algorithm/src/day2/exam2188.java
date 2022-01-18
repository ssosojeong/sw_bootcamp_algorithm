package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam2188 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int min = n+1;
        for(int i=0; i<=n/5; i++){
            for(int j=0; j<=n/3; j++){
                if(i*5 + j*3 == n){
                    if((i+j)<min) min = i+j;
                }
            }
        }
        System.out.println( min==n+1? -1: min );
    }
}
