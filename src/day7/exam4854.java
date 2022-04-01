package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class exam4854 {
    static public int N, M;
    static public char[][] inputs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        N = Integer.parseInt(input.split(" ")[0]);
        M = Integer.parseInt(input.split(" ")[0]);

        inputs = new char[N][M];

        for(int i=0; i<N; i++){
            input = br.readLine();
            for(int j=0; j<M; j++){
                inputs[i] = input.toCharArray();
            }
        }
    }

//    public static void search(int x, int y){
//
//        for(int i = y+1; i<N; i++){
//            char crr = inputs[i][x];
//            if(crr=='.') {
//                if(i==N-1)
//            }
//            else if(crr=='o')
//        }
//    }

}