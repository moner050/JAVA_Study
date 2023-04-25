package programmers.lv0;

import java.util.HashMap;
import java.util.Map;

// 문자열 묶기
// https://school.programmers.co.kr/learn/courses/30/lessons/181855
public class TieString_181855 {
    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};

        System.out.println(solution(strArr));
    }

    public static int solution(String[] strArr) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            if(map.containsKey(str.length())) map.put(str.length(), map.get(str.length()) + 1);
            else map.put(str.length(), 1);
        }

        for (int c : map.keySet()) {
            if(result < map.get(c)) result = map.get(c);
        }

        return result;
    }
}
