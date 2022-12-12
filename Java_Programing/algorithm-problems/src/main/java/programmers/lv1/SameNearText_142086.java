package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 가장 가까운 같은 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class SameNearText_142086 {
    public static void main(String[] args) {
//        String s = "banana";
        String s = "foobar";

        System.out.println(Arrays.toString(solution1(s)));
        System.out.println(Arrays.toString(solution2(s)));
    }

    public static int[] solution1(String s) {
        List<String> tArr = new ArrayList<>();
        List<Integer> sArr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;
            String txt = String.valueOf(s.charAt(i));

            if(!tArr.contains(txt)) {
                sArr.add(-1);
            }
            else {
                for (int j = tArr.size() - 1; j >= 0; j--, cnt++) {
                    if(tArr.get(j).equals(txt)) {
                        sArr.add(cnt + 1);
                        break;
                    }
                }
            }
            tArr.add(txt);
        }

        return sArr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
            }
            else {
                int beforeValue = map.get(s.charAt(i));
                answer[i] = i - beforeValue;
            }
            map.put(s.charAt(i), i);
        }
        return answer;
    }
}
