package BaekJoon.임시반장정하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJoon1268 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // 학생 수
        int[][] students = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                students[i][j] = scn.nextInt(); // 반 입력 받기
            }
        }

        //// 배열 확인하기
        //for (int i = 0; i < n; i++) {
        //    for (int j = 0; j < n; j++) {
        //        System.out.print(students[i][j] + " ");
        //    }
        //    System.out.println();
        //}

        int[] s = new int[n];
        int leader = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n-1; k++) {
                    if(students[i][j] == students[k+1][i]){
                        System.out.println(students[i][j]);
                        s[k] += 1;
                    }
                }
                System.out.println("=-----------");
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
