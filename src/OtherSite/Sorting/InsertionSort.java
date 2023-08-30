package OtherSite.Sorting;

import java.util.ArrayList;
import java.util.List;

/*삽입 정렬 구현하기
* 단순하지만 비효율적인 방법
* 석호의 아쉬운점 : 삽입은 항상 앞에 정렬 되어있다는 전제하에 돌리는거
* 그래서 바로 앞에꺼가 자기보다 작으면 더이상 비교안해 됨
* 
* */
public class InsertionSort {
    private static List<Integer> insertionList = new ArrayList<>();
    public static void main(String[] args) {
        insertionList.add(10);
        insertionList.add(2);
        insertionList.add(8);
        insertionList.add(4);
        insertionList.add(3);
        insertionList.add(11);

        // 오름차순
        for (int i = 1; i <insertionList.size() ; i++) {
            int key = insertionList.get(i);
            for (int j = i-1; j >=0 ; j--) {
                // 1. 기준 키 값에서 앞에 다 비교하기
                if(key < insertionList.get(j)){
                    // 2. 작으면 앞으로 이동
                    insertionList.set(j+1, insertionList.get(j)); // 큰 수 한칸 뒤로 밀기(키값 자리로)
                    insertionList.set(j, key); // 키 값 큰 수 앞에 넣기
                }
            }
        }
        System.out.println("오름차순: " + insertionList);

        // 내림차순
        for (int i = 1; i <insertionList.size() ; i++) {
            int key = insertionList.get(i);
            for (int j = i-1; j >=0 ; j--) {
                // 1. 기준 키 값에서 앞에 다 비교하기
                if(key > insertionList.get(j)){
                    // 2. 크면 앞으로 이동
                    insertionList.set(j+1, insertionList.get(j)); // 작은 수 한칸 뒤로 밀기(키값 자리로)
                    insertionList.set(j, key); // 키 값 작은 수 앞에 넣기
                }
            }
        }
        System.out.println("내림차순: " + insertionList);
    } // main
} // public class InsertionSort
