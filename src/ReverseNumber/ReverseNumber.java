package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //int n = 012; // 8진수로 인지
        //System.out.println("n입니당 : " + n);
        //1. 숫자 입력 받기
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            String n1 = scn.next();
            //2.숫자 뒤집기
            // 1) 반복문
            String reverseNum = "";
            for (int j = n1.length()-1; j >= 0; j--) {
                reverseNum += n1.charAt(j);
            }
            int num = Integer.parseInt(reverseNum);
            boolean result = true; // 소수 인지 구별하는 용도

            // 3. 소수 구하기
            // x가 주어졌을 때 x를 2~x-1까지 나눴을때 나누어 떨어지는 수가 하나라도 있으면 소수 X
            // 1은 소수가 아님
            for (int j = 2; j <num; j++) {
                if(num % j == 0) {
                    result = false; // 소수인 경우 result를 false로 변경
                    break;
                }
            }
            for (int j = 2; j <Math.sqrt(num); j++) {
                if(num % j == 0) {
                    result = false; // 소수인 경우 result를 false로 변경
                    break;
                }
            }

            if(result && num != 1) {// result가 true(소수 x)인 경우에만
                numbers[i] = num; // int[]에 저장
            }
        }

        //4. 소수만 출력하기
        for(int n : numbers){
            if(n !=0)
                System.out.print(n + " ");
        }

    }
}

/*뒤집은 소수
 *
 *N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는
 * 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다.
 * 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다
 *
 * 입력 설명
 *첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 *
 * 출력설명
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 *
 * ▣ 입력예제 1
 * 9
 * 32 55 62 20 250 370 200 30 100
 * ▣ 출력예제 1
 * 23 2 73 2 3
 * */
