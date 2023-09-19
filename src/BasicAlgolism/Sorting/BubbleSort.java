package BasicAlgolism.Sorting;

import java.util.List;

/*버블 정렬 구현해보기
* 단순하지만 비효율적인 방법
* */
public class BubbleSort {
    public static void main(String[] args) {
        boolean change;

        //// 내림 차순
        //for (int x = bubbleList.size()-1; x >= 0; x--) { // 스캔
        //    for (int i = 0; i < x; i++) { // 단계
        //        int fristNum = bubbleList.get(i);
        //        int nextNum = bubbleList.get(i+1);
        //        // 1. 인접한 수 비교하기
        //        if(bubbleList.get(i) < bubbleList.get(i+1)){ // 여기 부등호만 바꿔주면 오름차순/내림차순 정할 수 있음
        //            // 2. 작으면 자리 바꾸기
        //            int tmp = bubbleList.get(i); // 작은 수 빈 공간에 저장
        //            bubbleList.set(i, bubbleList.get(i+1)); // 큰 수 앞으로 당기기
        //            bubbleList.set(i+1, tmp); // 작은 수 큰 수 뒤에 넣기
        //        }
        //    }
        //}
        //
        //System.out.println("내림차순 : " + bubbleList);
    }
    public static List<Integer> bubbleSorting(List<Integer> list){
        boolean change;
        // 오름 차순 - 형우오빠꺼 훔쳐옴
        for (int x = list.size()-1; x >= 0; x--) { // 스캔
            change = true;
            for (int i = 0; i < x; i++) { // 단계
                // 1. 인접한 수 비교하기
                if(list.get(i) > list.get(i+1)){ // 여기 부등호만 바꿔주면 오름차순/내림차순 정할 수 있음
                    // 2. 크면 자리 바꾸기
                    int tmp = list.get(i); // 큰 수 빈 공간에 저장
                    list.set(i, list.get(i+1)); // 작은 수 앞으로 당기기
                    list.set(i+1, tmp); // 큰 수 작은 수 뒤에 넣기
                    change = false;
                }
            }
            if(change)
                break;
        }
        return list;
    }

}
