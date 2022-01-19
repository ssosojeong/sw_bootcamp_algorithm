package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam4093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] inputs = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        //누적합 구해놓기
        int[] baseSum = new int[n+1];
        baseSum[0] = 0;
        for(int i=0; i<n; i++){
            baseSum[i+1] = baseSum[i]+inputs[i];
        }

        //구간 [i,j]에 대해 평균수 구하고 check
        //시작점 선택하기
        double mean;
        int cnt = n;
        for(int i=0; i<n; i++){
            //끝점 선택하기
            for(int j=i+1; j<n; j++){
                mean = (double)(baseSum[j+1]-baseSum[i])/(j-i+1);
                for(int k=i; k<j+1; k++){
                    if(inputs[k]==mean){
                        cnt++; break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}