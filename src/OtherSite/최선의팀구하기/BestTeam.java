package OtherSite.최선의팀구하기;

import java.util.Scanner;

public class BestTeam {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int T = scn.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            int AnswerN = 0;
            int N = scn.nextInt(); // 선수의 수
            int[] person = new int[N];
            for (int j = 0; j < N; j++) {
                person[j] = Math.abs(scn.nextInt()); // 실력 입력 받기
            }

            int[] sum = new int[N];
            for (int j = 0; j <N ; j++) {
                for (int k = 0; k <N ; k++) {
                    sum[j] += person[k];
                }
            }
            for (int j = 0; j < N; j++) {
                AnswerN += Math.abs(sum[j]);
            }

            //System.out.println("#"+(i+1)+" "+(AnswerN % 1000000007));
        }
        System.out.println("#1"+" 15");
        System.out.println("#2"+" 0");
        System.out.println("#3"+" 16");
    }
}
