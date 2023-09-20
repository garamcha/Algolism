package OtherSite.수들의합;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 수들의 합 */
public class SumOfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 1. N 과 M 입력 받기
        String[] num = bf.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        // 2. 수열 입력 받기
        String [] _seq = bf.readLine().split(" ");
        // 2-1. 문자열로 받은 수열 int 형으로 형변환
        int[] seq = new int[N];
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(_seq[i]);
        }
        //// 2-2. 배열에 잘 들어갔는지 확인
        //for(int n : seq){
        //    System.out.println(n);
        //}

        // 3. M이 되는 경우의 수 구하기

        int cnt = 0; // 경우의 수
        for (int i = 0; i < N; i++) {
            int sum = 0; // M과 같은 수 만들 놈
            for (int j = i; j < N; j++) {
                sum += seq[j];
                if(sum == M) { // M과 같으면 for문 종료
                    cnt++;
                    break;
                }
            }
        }

        // 4. 경우의 수 출력하기
        System.out.println(cnt);




        //int cnt = 0; // 경우의 수
        //for (int i = 0; i < N; i++) {
        //    int sum = seq[i]; // M과 같은 수 만들 놈
        //    if(sum == M) { // M과 같으면 for문 처음으로 돌아가기
        //        cnt++;
        //        continue;
        //    }
        //    for (int j = i+1; j < N; j++) {
        //        sum += seq[j];
        //        if(sum == M) { // M과 같으면 for문 종료
        //            cnt++;
        //            break;
        //        }
        //    }
        //}


    }
}

/*
    수들의 합
    N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다. 이 수열의 i번째 수부터 j번째 수까지의
        합 A[i]+A[i+1]+…+A[j-1]+A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.

        ▣ 입력설명
        첫째 줄에 N(1≤N≤10,000), M(1≤M≤300,000,000)이 주어진다. 다음 줄에는 A[1], A[2], …,
        A[N]이 공백으로 분리되어 주어진다. 각각의 A[x]는 30,000을 넘지 않는 자연수이다.
        ▣ 출력설명
        첫째 줄에 경우의 수를 출력한다.
        ▣ 입력예제 1
        8 3
        1 2 1 3 1 1 1 2
        ▣ 출력예제 1
        5
*/
