package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam1317 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        //입력값 받기
        int[][] inputs = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            inputs[i][0] = Integer.parseInt(st.nextToken());
            inputs[i][1] = Integer.parseInt(st.nextToken());
        }

        //누적합 구해놓기
        int[] baseSum = new int[n];
        for(int i=1; i<n; i++){
            baseSum[i] = baseSum[i-1] + dist(inputs[i-1], inputs[i]);
        }

        //비교하기
        int min = 2147483647;
        int tempSum = 0;
        for(int i=1; i<n-1; i++){
           tempSum = baseSum[i-1] + baseSum[n-1]-baseSum[i+1] + dist(inputs[i-1],inputs[i+1]);
           if(tempSum<min) min = tempSum;
        }
        System.out.print(min);
    }
    public static int dist(int[] xy1, int[] xy2){
        int xDis = xy1[0]-xy2[0]>0 ? xy1[0]-xy2[0] : -(xy1[0]-xy2[0]);
        int yDis = xy1[1]-xy2[1]>0 ? xy1[1]-xy2[1] : -(xy1[1]-xy2[1]);

        return xDis+yDis;
    }
}