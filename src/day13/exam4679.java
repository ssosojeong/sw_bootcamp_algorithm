package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class exam4679 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        TreeSet<String> set = new TreeSet<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if (state.equals("enter")) {
                set.add(name);
            } else if(state.equals("leave")) {
                set.remove(name);
            }
        }

        sb.append(set.size() + "\n");
        for (String str : set) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}
