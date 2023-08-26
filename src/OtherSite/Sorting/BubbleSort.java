package OtherSite.Sorting;

import java.util.ArrayList;
import java.util.List;

/*버블 정렬 구현해보기*/
public class BubbleSort {
    private static List<Integer> bubbleList = new ArrayList<>();
    public static void main(String[] args) {
        bubbleList.add(7);
        bubbleList.add(1);
        bubbleList.add(4);
        bubbleList.add(5);
        bubbleList.add(9);
        bubbleList.add(10);
        bubbleList.add(2);
        bubbleList.add(8);
        bubbleList.add(34);
        bubbleList.add(22);
        bubbleList.add(6);
        bubbleList.add(3);


        // 오름 차순
        for (int x = bubbleList.size()-1; x >= 0; x--) { // 스캔
            for (int i = 0; i < x; i++) { // 단계
                int fristNum = bubbleList.get(i);
                int nextNum = bubbleList.get(i+1);
                // 1. 인접한 수 비교하기
                if(bubbleList.get(i) > bubbleList.get(i+1)){ // 여기 부등호만 바꿔주면 오름차순/내림차순 정할 수 있음
                    // 2. 크면 자리 바꾸기
                    int tmp = bubbleList.get(i); // 큰 수 빈 공간에 저장
                    bubbleList.set(i, bubbleList.get(i+1)); // 작은 수 앞으로 당기기
                    bubbleList.set(i+1, tmp); // 큰 수 작은 수 뒤에 넣기
                }
            }
        }
        System.out.println("오름차순 : " + bubbleList);

        // 내림 차순
        for (int x = bubbleList.size()-1; x >= 0; x--) { // 스캔
            for (int i = 0; i < x; i++) { // 단계
                int fristNum = bubbleList.get(i);
                int nextNum = bubbleList.get(i+1);
                // 1. 인접한 수 비교하기
                if(bubbleList.get(i) < bubbleList.get(i+1)){ // 여기 부등호만 바꿔주면 오름차순/내림차순 정할 수 있음
                    // 2. 작으면 자리 바꾸기
                    int tmp = bubbleList.get(i); // 작은 수 빈 공간에 저장
                    bubbleList.set(i, bubbleList.get(i+1)); // 큰 수 앞으로 당기기
                    bubbleList.set(i+1, tmp); // 작은 수 큰 수 뒤에 넣기
                }
            }
        }

        System.out.println("내림차순 : " + bubbleList);
    }

}
