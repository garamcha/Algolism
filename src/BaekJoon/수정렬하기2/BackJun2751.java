package BaekJoon.수정렬하기2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 버블 정렬을 사용하여 수 정렬하기2
public class BackJun2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
    }

    /*
    // 백준 통과용 코드
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n 입력 받기
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            // n 줄 만큼 정수 입력 받기
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for (int el: list) {
            sb.append(el + "\n");
        }
        System.out.println(sb);
    }
    * */
}
