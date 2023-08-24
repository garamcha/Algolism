import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 뒤집 소수
        sol1();

    }

    public static void sol1() {
        // 1-1. n 입력 받기
        int n = scanner.nextInt();

        for(int t = 0; t < n; t++) {
            // 1-2. 숫자들 입력 받기
            int num = scanner.nextInt();

            // 2-1. 숫자 뒤집기
            int reverseNum = 0;
            while(num != 0) {
                reverseNum *= 10;
                reverseNum += num % 10;
                num /= 10;
            }

            // 2-2. 소수 구하기
            boolean flag = (reverseNum != 1) ? true : false;
            for(int i = 2; i < Math.sqrt(reverseNum); i++) {
                if(reverseNum % i == 0) {
                    flag = false;
                    break;
                }
            }

            // 3. 결과 출력
            if(flag) {
                System.out.println(reverseNum);
            }
        }
    }
}