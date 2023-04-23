package programmers.lv0;

import java.util.Arrays;

// x 사이의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/181867
public class CountBetweenX_181867 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
//        String myString = "xabcxdefxghi";

        System.out.println(Arrays.toString(solution(myString)));
    }

    public static int[] solution(String myString) {
        String[] temp = myString.split("x");
        int length = temp.length;
        if (myString.charAt(myString.length() - 1) == 'x') length++;

        int[] result = new int[length];

        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[i].length();
        }

        return result;
    }
}
