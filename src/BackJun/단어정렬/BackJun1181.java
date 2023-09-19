package BackJun.단어정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 선택 정렬을 이용해서 단어 정렬하기
public class BackJun1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 1. 단어 개수 n 입력 받기
        int n = Integer.parseInt(bf.readLine());
        // 2. 단어 입력 받기
        List<String> words = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            String w = bf.readLine();
            if(!words.contains(w))
                words.add(w);
        }

        // 3. 단어 길이가 짧은 순으로 정렬하기
        for (int i = 0; i < words.size(); i++) {
            int minIndex = i;
            for (int j = i+1; j < words.size(); j++) {
                // 3-1. 최소값 찾기
                if(words.get(j).length() < words.get(minIndex).length()){
                    minIndex = j;
                }
            }
            // 3-2. 자리 바꾸기
            String tmp = words.get(i);
            words.set(i, words.get(minIndex));
            words.set(minIndex, tmp);
        }
        for (int i = 0; i < words.size()-1; i++) {
            if((words.get(i).compareTo(words.get(i+1)) > 0)
                    && words.get(i).length() == words.get(i+1).length()){
                String tmp = words.get(i);
                words.set(i, words.get(i+1));
                words.set(i+1, tmp);
            }
        }

        // 4. 같은 길이 사전순으로 정렬하기
        //for (int i = 0; i < words.size(); i++) {
        //    int minIndex = i;
        //    for (int j = i+1; j < words.size(); j++) {
        //        if((words.get(i).compareTo(words.get(j)) > 0)
        //                && words.get(i).length() == words.get(j).length()){
        //            String tmp = words.get(i);
        //            words.set(i, words.get(j));
        //            words.set(j, tmp);
        //        }
        //    }

        //
        //}


        for(String word : words){
            sb.append(word + "\n");
        }
        System.out.println(sb);
    }

}
