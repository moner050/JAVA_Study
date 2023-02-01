package programmers.lv2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 튜플
// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class Tuple_64065 {
    public static void main(String[] args) {
//        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//        String s = "{{123}}";
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

        System.out.println(Arrays.toString(solution1(s)));
        System.out.println(Arrays.toString(solution2(s)));
    }

    public static int[] solution1(String s) {
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

    public static int[] solution2(String s) {
        int idx = 0;
        Set<String> set = new HashSet<>();
        // { 와 } 를 띄어쓰기로 바꿔준 뒤 문자 맨 왼쪽, 오른쪽 공백을 제거 후 문자 사이에 , 를 기준으로 배열생성.
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        // 배열 크기 오름차순으로 정렬
        Arrays.sort(arr, (x, y) -> {return x.length() - y.length();});

        int[] result = new int[arr.length];
        for (String s1 : arr) {
            for (String s2 : s1.split(",")) {
                if(set.add(s2)) result[idx++] = Integer.parseInt(s2);
            }
        }

        return result;
    }
}
