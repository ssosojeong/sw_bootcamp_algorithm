package mid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam196 {
    public static int[] di={0,1,1};
    public static int[] dj={1,1,0};
    public static int[][] inputs;
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        N = Integer.parseInt(input.split(" ")[0]);
        M = Integer.parseInt(input.split(" ")[1]);

        inputs = new int[N][M];
        for(int i=0; i<N; i++){
            input = br.readLine();
            for(int j=0; j<M; j++){
                inputs[i][j] = input.charAt(j)-'0';
            }
        }

        int max = 0; int val;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                val = check(i, j);
                max = max<val? val: max;
            }
        }

        System.out.println((max+1)*(max+1));


    }

    public static int check(int i, int j){
        int res = 0;
        int k=0;
        int cnt;
        while(true){
            k++;
            cnt = 0;

            for(int d=0; d<3; d++){
                int newJ = j+k*dj[d];
                int newI = i+k*di[d];
                if(newI>N-1 || newJ>M-1) {
                    return res;
                }
                if(inputs[newI][newJ]==inputs[i][j]){
                    cnt++;
                } else break;
            }

            if(cnt==3){
                res = res<k? k : res;
            }
        }
    }
}
