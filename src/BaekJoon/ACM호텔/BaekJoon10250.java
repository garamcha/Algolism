package BaekJoon.ACM호텔;

import java.util.Scanner;

public class BaekJoon10250 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int T = scn.nextInt(); // 테스트 데이터 수
        for (int i = 0; i < T; i++) {
            int floor = scn.nextInt(); // 호텔의 층 수
            int room = scn.nextInt(); // 각 층의 방 수
            int client = scn.nextInt(); // 몇번째 손님인지

            int f = client % floor;
            int ho = (client / floor) + 1;
            if(f == 0){
                f = floor;
                ho = (client / floor);
            }

            System.out.printf("%d%02d\n",f, ho);
        }
    }
}
/*
    int T = scn.nextInt(); // 테스트 데이터 수
        for (int i = 0; i < T; i++) {
        int floor = scn.nextInt(); // 호텔의 층 수
        int room = scn.nextInt(); // 각 층의 방 수
        int client = scn.nextInt(); // 몇번째 손님인지

        int cnt = 0;

        for (int j = 1; j <= room; j++) {
        for (int k = 1; k <= floor; k++) {
        cnt++;
        if(cnt == client){
        System.out.printf("%d%02d\n", k, j);
        break;
        }
        }
        if (cnt >= client)
        break;
        }
        }

 */