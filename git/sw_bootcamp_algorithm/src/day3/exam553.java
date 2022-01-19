package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam553 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] inputs = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            inputs[i][0] = Integer.parseInt(st.nextToken());
            inputs[i][1] = Integer.parseInt(st.nextToken());
        }

        int tempSum = 0;
        int tempMin; int sum = 0;
        for(int i=0; i<n; i++){
            tempMin = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(inputs[i][1]!=inputs[j][1] || i==j) continue;
                if(inputs[i][0]>inputs[j][0]){
                    tempSum = inputs[i][0]-inputs[j][0];
                } else{
                    tempSum = inputs[j][0]-inputs[i][0];
                }
                tempMin = tempMin>tempSum?tempSum:tempMin;
            }
            sum+=tempMin;
        }
        System.out.println(sum);
    }
}