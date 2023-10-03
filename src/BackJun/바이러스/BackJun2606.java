package BackJun.바이러스;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJun2606 {
    static Scanner scn = new Scanner(System.in);
    static List<List<Integer>> node = new ArrayList<>();
    static boolean[] visited;
    static int cnt = 0;
    public static void main(String[] args) {
        int N = scn.nextInt();
        int M = scn.nextInt();
        visited = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            node.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();

            node.get(n1).add(n2);
            node.get(n2).add(n1);
        }

        virus(1);
        System.out.println(cnt - 1);
    }

    static void virus(int n){
        if(!visited[n]){
            visited[n] = true;
            cnt++;
            for (int i = 0; i < node.get(n).size(); i++) {
                virus(node.get(n).get(i));
            }
        }
    }
}
