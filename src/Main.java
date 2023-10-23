import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][5];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean[] result = new boolean[N];
        int max = -1;
        int temp = 1;

        for (int k = 0; k < N; k++) {
            int count = 0;
            Arrays.fill(result, false);

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < N; j++) {
                    if(j == k) continue;
                    if (arr[k][i] == arr[j][i] && !result[j]) {
                        result[j] = true;
                        count++;
                    }
                }
            }
            //System.out.println(k+1 + " 번째 학생 : " + count);
            if(count > max) {
                max = count;
                temp = k + 1;
            }
        }
        System.out.println(temp);

    }

}