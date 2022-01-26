package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam1 {
    public static int[][] inputs = new int[5][5];
    public static int[][] bingo = new int[5][5];
    public static int[] check = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<5; j++){
                inputs[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int tar = 0;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<5; j++){
                bingo[i][j] = Integer.parseInt(st.nextToken());
                if(bingo[i][j]==1){
                    check[j]++;
                    check[i+5]++;
                    if(i+j==4) check[10]++;
                    if(i==j) check[11]++;
                }
            }
        }

        int min = 2147483647;
        int temp;
        for(int i=0; i<12; i++){
            //한 개의 0을 1로 칠하여 전체 줄을 칠할 수 있다면
            if(check[i]==4){
                //칠할 값을 찾아야 함
                temp = searchValue(i);
                if(temp<min) min = temp;
            }
        }
        System.out.println(min);
    }

    public static int searchValue(int x){
        int res = 0;
        if(x<5){
            for(int i=0; i<5; i++){
                if(bingo[i][x]==0) res = inputs[i][x];
            }
        } else if(x<10 && x>=5){
            for(int i=0; i<5; i++){
                if(bingo[x-5][i]==0) res =inputs[x-5][i];
            }
        } else if(x==10){
            for(int i=0; i<5; i++){
                if(bingo[4-i][i]==0) res =inputs[4-i][i];
            }
        } else{
            for(int i=0; i<5; i++){
                if(bingo[i][i]==0) res=inputs[i][i];
            }
        }
        return res;
    }


}
