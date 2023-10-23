package BaekJoon.바닥장식;

import java.util.Scanner;

public class BaekJoon1388 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N  = scn.nextInt(); // 타일 세로
        int M = scn.nextInt(); // 타일 가로

        String [] tile = new String[N];

        // 타일 입력 받기
        for (int i = 0; i < N; i++) {
            tile[i] = scn.next();
        }

        // "-" 타일 찾기
        int cnt = 0;
        boolean same = true;
        for (int i = 0; i < N; i++) {
            String oneTile = tile[i];
            for (int j = 0; j < M; j++) {
                if(oneTile.charAt(j) == '|'){
                    same = true;
                }
                if(same && (oneTile.charAt(j) == '-')){
                    cnt++;
                    same = false;
                }
            }
            same=true;
        }

        //"|" 타일 찾기
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                String oneTile = tile[j];
                if(oneTile.charAt(i) == '-'){
                    same = true;
                }
                if(same && (oneTile.charAt(i) == '|')){
                    cnt++;
                    same = false;
                }
            }
            same=true;
        }

        System.out.println(cnt);
    }
}
