package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam4854 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] inputs = new char[N][M];

        for(int i=0; i<N; i++){
            inputs[i] = br.readLine().toCharArray();
        }

        for(int j=0; j<M; j++){
            for(int i = N-1; i>=0; i--){
                if(inputs[i][j]=='.'){
                    for(int k = i-1; k>=0; k--){
                        if(inputs[k][j]=='o'){
                            inputs[i][j] = 'o';
                            inputs[k][j] = '.';
                            break;
                        } else if(inputs[k][j]=='#'){
                            break;
                        }
                    }
                }
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(inputs[i][j]);
            }
            System.out.println();
        }
    }
}
