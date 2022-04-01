package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam4103 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //입력값 받기
        String tar = br.readLine();
        int length = tar.length();
        String[] inputs = new String[n];
        for(int i=0; i<n; i++){
            inputs[i] = br.readLine();
        }

        boolean flag; int same; int cnt=0;
        //비교하기
        for(int i=0; i<n; i++){
            flag = false;
            //시작지점 정하기
            for(int j=0; j<=inputs[i].length()-length;j++){
                for(int d=0; j+(d+1)*(length-1)<inputs[i].length(); d++){
                    same=0;
                    for(int k=0; k<length; k++){
                        if(inputs[i].charAt(j+k*(d+1))==tar.charAt(k)) {
                            same++;
                            if(same==length) { flag=true; break; }
                            continue;
                        }
                        else break;
                    }
                    if(flag) break;
                }
                if(flag) break;
            }
            if(flag) cnt++;
        }

        System.out.println(cnt);
    }
}