package BackJun.수정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import OtherSite.Sorting.BubbleSort;

// 삽입 정렬을 이용하여 수 정렬하기
public class BackJun2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        BubbleSort sort = new BubbleSort();


        // n 입력 받기
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            // n 줄 만큼 정수 입력 받기
            list.add(Integer.parseInt(br.readLine()));
        }
        list = sort.bubbleSorting(list);

        for (int el: list) {
            System.out.println(el);
        }
    }
}
