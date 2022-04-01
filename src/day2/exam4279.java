package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam4279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = "";
        int[] intArr = new int[n];
        int game = 0; int max=0; int tempMin;

        for(int i=0; i<n; i++){
            input = br.readLine();
            //우선 게임 결과를 배열에 저장
            switch(input){
                case("H"): intArr[0]++; break;
                case("P"): intArr[1]++; break;
                case("S"): intArr[2]++; break;
            }
            //게임 결과 배열에서 최소값 찾기 -> 총 게임 수에서 최소값을 빼면 이길 수 있는 최대값
            tempMin = n+1;
            game++;
            for(int j=0; j<n; j++){
                if(intArr[j]<tempMin) tempMin = intArr[j];
            }
            if(max<game-tempMin) max = game-tempMin;
        }
        System.out.println(max);
    }
}
