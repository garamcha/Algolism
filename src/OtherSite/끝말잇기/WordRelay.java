package OtherSite.끝말잇기;

import java.util.*;

public class WordRelay {
    static List<String> word_dict = new ArrayList<>();
    static int maxCount = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int result = 0;
        String s = scn.next(); // 기록 문자열
        int n = scn.nextInt(); // 사용 가능 단어 배열 크기
        for (int i = 0; i < n; i++) {
            word_dict.add(scn.next()); // 사용 가능 단어 입력
        }

        System.out.println(wordCount(s, result));
    }

    public static int wordCount(String word, int cnt) {

        if(word.length() <= 1){
            return cnt;
        }
        for (int i = 0; i < word_dict.size(); i++) {
            if(word.startsWith(word_dict.get(i))){
                int tmp = wordCount(word.substring(word_dict.get(i).length()-1),++cnt);
                return maxCount = Math.max(maxCount, tmp);
            }
        }
        return maxCount;
    }

}
