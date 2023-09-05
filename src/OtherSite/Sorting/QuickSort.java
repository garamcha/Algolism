package OtherSite.Sorting;

import java.util.ArrayList;
import java.util.List;

/*퀵 정렬 구현하기
* 복잡하지만 효율적인 방법
* */
public class QuickSort {

    public static void main(String[] args) {
        List<Integer> quickList = new ArrayList<>();
        quickList.add(5);
        quickList.add(3);
        quickList.add(8);
        quickList.add(4);
        quickList.add(9);
        quickList.add(1);
        quickList.add(6);
        quickList.add(2);
        quickList.add(7);
        System.out.println(quickList);
        List<Integer> sortList = quickSorting(quickList);
        System.out.println(sortList);
    }

    public static List<Integer> quickSorting(List<Integer> list){
        // 1. pivot 설정
        int pivot = list.get(0);
        // 2. low, high 설정
        int low = 1; // 피벗 다음 위치 부터
        int high = list.size()-1; // 리스트의 마지막 위ㅊ
        // 3. low, high 크기 비교 후 교환
        //3-1. high, low가 엇갈려서 지난 후 스탑
        while(low < high){
            if(list.get(low) > list.get(high)){
                int tmp = list.get(low);
                list.set(low, list.get(high));
                list.set(high, tmp);
            }
            low++;high--;
        }
        // 4. pivot high 위치랑 교환
        list.set(0, list.get(high));
        list.set(high, pivot);
        // 5-1. pivot 보다 작은 값 리스트
        List<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < high; i++) {
            smallList.add(list.get(i));
        }
        // 리스트의 크기가 0이나 1이 되기 전까지 함수 호출
        if (smallList.size() > 1)
            smallList = quickSorting(smallList);
        // 5-2. pivot 보다 큰 값 리스트
        List<Integer> largeList = new ArrayList<>();
        for (int i = low; i < list.size(); i++) {
            largeList.add(list.get(i));
        }
        // 리스트의 크기가 0이나 1이 되기 전까지 함수 호출
        if(largeList.size() > 1)
            largeList = quickSorting(largeList);
        System.out.println(list);

        list.addAll(smallList);
        list.add(pivot);
        list.addAll(largeList);
        return list;
    }


}
                                                                      