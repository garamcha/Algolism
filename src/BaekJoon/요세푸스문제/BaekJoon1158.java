package BaekJoon.요세푸스문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1158 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // N, K 입력 받기
        int N = scn.nextInt();
        int K = scn.nextInt();

        Queue<Integer> number = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        // Queue에 값 넣기
        for (int i = 0; i < N; i++) {
            number.add(i+1);
        }

        int cnt = 0;
        while (!number.isEmpty()){
            cnt++;
            // Queue에서 값 뽑아버리기
            if(cnt == K){
                sb.append(number.poll());
                if(!number.isEmpty()){
                    sb.append(", ");
                }
                cnt = 0;
                continue;
            }
            // Queue 순환 시키기
            number.add(number.poll()); // 앞에거 뒤로 넣기
        }
        System.out.println("<"+sb+">");

    }
}
