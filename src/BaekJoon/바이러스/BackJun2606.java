package BaekJoon.바이러스;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJun2606 {
    static Scanner scn = new Scanner(System.in);
    static List<List<Integer>> node = new ArrayList<>();
    static boolean[] visited;
    static int cnt = 0; // 감염된 컴퓨터 수
    public static void main(String[] args) {
        int N = scn.nextInt();
        int M = scn.nextInt();
        visited = new boolean[N+1]; // 방문 체크 배열
        for (int i = 0; i <= N; i++) {
            node.add(new ArrayList<>()); // 2차원 리스트 생성
        }

        for (int i = 0; i < M; i++) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();

            node.get(n1).add(n2); // 해당 2차원 리스트에 값 넣기
            node.get(n2).add(n1); // 서로 연결되어 있기 때문에 바꿔서도 연결
        }

        virus(1);
        System.out.println(cnt - 1); // 1번컴퓨터를 제외한 감염된 컴퓨터 수
    }

    static void virus(int n){
        if(!visited[n]){
            visited[n] = true; // 방문 했음을 표시
            cnt++;
            for (int i = 0; i < node.get(n).size(); i++) {
                virus(node.get(n).get(i)); // 재귀함수
            }
        }
    }
}
