package OtherSite.Sorting;

import java.util.ArrayList;
import java.util.List;

/*퀵 정렬 구현하기
* 복잡하지만 효율적인 방법
* */
public class QuickSort {

    public static void main(String[] args) {
        List<Integer> quickList = new ArrayList<>();
        quickList.add(3);
        quickList.add(12);
        quickList.add(4);
        quickList.add(6);
        quickList.add(1);
        quickList.add(5);
        quickList.add(2);

        System.out.println(QuickSorting(quickList));

    }
    public static List<Integer> QuickSorting(List<Integer> quickList){
        // 1. pivot 설정하기
        int pivot = quickList.get(0); // 피벗(비교 기준 수)
        List<Integer> smallNumList = new ArrayList<>(); // 피벗기준 작은 수
        List<Integer> bigNumList = new ArrayList<>(); // 피벗 기준 큰 수
        if(quickList.size() == 1 || quickList.size() == 0){
            return quickList;
        }
        // 2. 작은수 왼쪽 큰 수 오른쪽 나누기
        for (int i = 1; i < quickList.size(); i++) {
            // 피벗보다 작으면
            if(quickList.get(i) < pivot){
                // 피벗 기준 작은 수 리스트에 삽입
                smallNumList.add(quickList.get(i));
            } else{ // 피벗보다 크면
                bigNumList.add(quickList.get(i));
            }
        }
        // 3. 마지막 덩어리가 0또는 1일때 까지 반복
        List<Integer> returnList = new ArrayList<>();
        returnList.addAll(smallNumList);
        returnList.add(pivot);
        returnList.addAll(bigNumList);
        return returnList;
    }

    public static void smallSort(List<Integer> smallList){
        int pivot;
        if(smallList.size() == 3){
            pivot = smallList.get(1);
        }
    }

}
                                                                      