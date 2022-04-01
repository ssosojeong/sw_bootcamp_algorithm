package mid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam4766 {
    public static int[] inputs;
    public static int N;
    public static boolean pos;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String input;

        inputs = new int[N];
        pos = true;

        for(int i=0; i<N; i++){
            input = br.readLine();
            for(int j=0; j<N; j++){
                if(input.charAt(j)=='Q'){
                    if(inputs[j]!=0) pos = false;
                    inputs[j] = i;
                }
            }
        }

        if(pos){
            for(int i=0; i<N; i++) check(i);
        }

        System.out.println(pos? "Yes" : "No");

    }

    public static void check(int col){
        for(int i=0; i<N; i++){
            if(i==col) continue;

            if(inputs[i]==inputs[col] || Math.abs(col-i)==Math.abs(inputs[col]-inputs[i])){
                pos = false;
                return;
            }
        }
    }
}
