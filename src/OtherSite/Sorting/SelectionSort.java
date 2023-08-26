package OtherSite.Sorting;

import java.util.ArrayList;
import java.util.List;

/*선택 정렬 구현 해보기*/
public class SelectionSort {
    private static List<Integer> selectionList = new ArrayList<>();

    public static void main(String[] args) {
        selectionList.add(7);
        selectionList.add(1);
        selectionList.add(4);
        selectionList.add(-1);
        selectionList.add(34);
        selectionList.add(22);
        selectionList.add(6);
        selectionList.add(3);

        // 오름 차순
        for (int x = 0; x < selectionList.size(); x++) {
            int minIndex = x; // 최소값 인덱스
            for (int i = x; i < selectionList.size(); i++) { // 여기 부등호만 바꿔주면 오름차순/내림차순 정할 수 있음
                // 1. 최소값 찾기
                if(selectionList.get(i) < selectionList.get(minIndex)){
                    minIndex = i;
                }
            }
            // 2. 자리 바꾸기
            int tmp = selectionList.get(x); // 첫번째 비굣값 빈 공간에 넣기
            selectionList.set(x, selectionList.get(minIndex)); // 최솟값 가장 앞으로 이동
            selectionList.set(minIndex, tmp); // 빈자리(최소값자리)에 쫓겨난 숫자 넣기
        }

        System.out.println("오름차순 : " + selectionList);

        // 내림 차순
        for (int x = 0; x < selectionList.size(); x++) {
            int maxIndex = x; // 최대값 인덱스
            for (int i = x; i < selectionList.size(); i++) {
                // 1. 최대값 찾기
                if(selectionList.get(i) > selectionList.get(maxIndex)){ // 여기 부등호만 바꿔주면 오름차순/내림차순 정할 수 있음
                    maxIndex = i;
                }
            }
            // 2. 자리 바꾸기
            int tmp = selectionList.get(x); // 첫번째 비굣값 빈 공간에 넣기
            selectionList.set(x, selectionList.get(maxIndex)); // 최대값 가장 앞으로 이동
            selectionList.set(maxIndex, tmp); // 빈자리(최소값자리)에 쫓겨난 숫자 넣기
        }

/*        // 최대값으로 오름 차순 정렬
        for (int x = selectionList.size()-1; x >= 0; x--) {
            int maxIndex = x; // 최대값 인덱스
            for (int i = 0; i < x; i++) {
                // 1. 최대값 찾기
                if(selectionList.get(maxIndex) < selectionList.get(i) ){
                    maxIndex = i;
                }
            }
            // 2. 자리 바꾸기
            int tmp = selectionList.get(x); // 첫번째 비굣값 빈 공간에 넣기
            selectionList.set(x, selectionList.get(maxIndex)); // 최솟값 가장 앞으로 이동
            selectionList.set(maxIndex, tmp); // 빈자리(최소값자리)에 쫓겨난 숫자 넣기
        }*/

        System.out.println("내림차순 : " + selectionList);
    }
}
