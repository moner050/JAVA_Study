package programmers.lv0;

import java.util.Arrays;

// 배열에서 문자열 대소문자 변환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181875
public class ConvertCase_181875 {
    public static void main(String[] args) {
        String[] strArr = {"AAA","BBB","CCC","DDD"};

        System.out.println(Arrays.toString(solution(strArr)));
    }

    public static String[] solution(String[] strArr) {
        String[] result = new String[strArr.length];

        for (int i = 1; i <= strArr.length; i++) {
            if(i % 2 == 1) result[i-1] = strArr[i-1].toLowerCase();
            else result[i-1] = strArr[i-1].toUpperCase();
        }

        return result;
    }
}
