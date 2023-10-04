package BaekJoon.반복수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/*
 백준 2331번 문제
 반복 수열
*/
public class BackJun2331 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sequence = new ArrayList<>();
        String[] strs = bf.readLine().split(" ");
        // 1. A랑 P 입력 받기
        int num = Integer.parseInt(strs[0]); // A
        int pow = Integer.parseInt(strs[1]); // P

        sequence.add(num); // 첫번째 숫자 배열에 넣어주기
        int idx = repeatSum(sequence, pow); // 반복적으로 수열 구하기
        System.out.println(idx); // 개수 출력
    }

    // 2. D[n-1]의 각 자리의 숫자를 P번 곱한 수들의 합 구하기
    public static int mulAndSum(int n, int p){
        int split = 0, sum = 0;
        while(true){
            split = n % 10;
            sum += Math.pow(split, p);
            if(n/10 == 0)
                break;
            n /= 10;
        }
        return sum;
    }

    // 3. 반복 수열이 나올때까지 반복
    public static int repeatSum(List<Integer> seq, int pow){
        int idx = 0;
        while(true){
            int checkNum = mulAndSum(seq.get(idx++), pow);
            // 4. 반복 수열 찾기
            if(seq.contains(checkNum)) {
                idx = seq.indexOf(checkNum); // 가장 앞에 있는 놈을 가져옴
                break;
            }
            else
                seq.add(checkNum);
        }
        return idx;
    }
}

