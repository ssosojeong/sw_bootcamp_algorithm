package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam2123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cards = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum>max && sum<m) max = sum;
                    //if(sum<=max || sum>m) continue;
                    //                    else{
                    //                        max = sum;
                    //                    }
                }
            }
        }
        System.out.println(max);

    }
}
