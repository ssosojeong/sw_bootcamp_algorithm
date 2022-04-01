package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam2625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=1; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(n-i-j>=j && n-i-j<i+j) cnt++;
            }
        }
        System.out.println(cnt);
    }

}
