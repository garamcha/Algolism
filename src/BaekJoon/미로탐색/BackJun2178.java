package BaekJoon.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 미로 탐색 */
public class BackJun2178 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. 미로 크기 입력 받기
        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);

        // 2. 미로 입력 받기
        String[] maze = new String[N];
        for (int i = 0; i < N; i++) {
            maze[i] = br.readLine();
        }
        //// 미로 테스트 출력
        //for(String m : maze){
        //    System.out.println(m);
        //}



    }

}
