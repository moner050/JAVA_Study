package programmers.lv2;

import java.util.Arrays;
import java.util.HashSet;

// 튜플
// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class Tuple_64065 {
    public static void main(String[] args) {
//        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//        String s = "{{123}}";
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int[] result = {};
        String[] arr = s.split("\\},\\{");

        arr[0] = arr[0].replaceAll("[{}]", "");
        arr[arr.length - 1] = arr[arr.length - 1].replaceAll("[{}]", "");

        String[][] sortedByLength = new String[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            String[] str = arr[i].split(",");
            sortedByLength[str.length - 1] = str;
        }

        HashSet<String> hashSet = new HashSet<>();
        String[] resultArr = new String[arr.length];

        for (int i = 0; i < sortedByLength.length; i++) {
            for (int j = 0; j < sortedByLength[i].length; j++) {
                if(!hashSet.contains(sortedByLength[i][j])) {
                    resultArr[i] = sortedByLength[i][j];
                    hashSet.add(sortedByLength[i][j]);
                }
            }
        }

        int[] answer = new int[resultArr.length ];
        for (int i = 0; i < resultArr.length; i++) {
            answer[i] = Integer.parseInt(resultArr[i]);
        }

        return answer;
    }
}
