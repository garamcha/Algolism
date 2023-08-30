import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sequence = new ArrayList<>();

        // 1. A랑 P 입력 받기
        int num = Integer.parseInt(bf.readLine()); // A
        int pow = Integer.parseInt(bf.readLine()); // P

        sequence.add(num); // 첫번째 숫자 배열에 넣어주기
        int idx = repeatSum(sequence, pow); // 반복적으로 수열 구하기
        System.out.println(idx); // 개수 출력
        //System.out.println(sequence);
        //System.out.println(sequence.size());
    }

    // 2. D[n-1]의 각 자리의 숫자를 P번 곱한 수들의 합 구하기
    public static int mulAndSum(int n, int p){
        int split = 0, sum = 0;
        boolean check = true;
        while(check){
            split = n % 10;
            sum += Math.pow(split, p);
            if(n/10 == 0)
                check = false;
            n = n / 10;
        }
        return sum;
    }

    // 3. 반복 수열이 나올때까지 반복
    public static int repeatSum(List<Integer> seq, int pow){
        boolean check = true;

        int idx = 0;
        while(check){
            int checkNum = mulAndSum(seq.get(idx++), pow);
            // 4. 반복 수열 찾기
            if(seq.contains(checkNum)) {
                idx = seq.indexOf(checkNum);
                check =false;
            }
            else
                seq.add(checkNum);
        }

        return idx;
    }
}