package mid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam3008 {
    public static ArrayList<ArrayList<Integer>> map;
    public static int[] color;
    public static int N, M;
    public static boolean pos;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        map = new ArrayList<>();
        color = new int[N];
        pos = true;

        for(int i=0; i<N; i++){
            map.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for(int i=0; i<N; i++){
            if(color[i]==0) coloring(i, 1);
        }
        if(pos) System.out.println("OK");
        else System.out.println("IMPOSSIBLE");

    }

    public static void coloring(int tar, int c){
        color[tar] = c;
        for(int node: map.get(tar)){
            if(color[node]==color[tar]) pos = false;
            if(color[node]==0){
                coloring(node,3-c);
            }
        }
    }
}
