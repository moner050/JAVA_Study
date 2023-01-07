package programmers.lv2;

import java.util.Arrays;

// 이진 변환 반복하기
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class RepeatBinaryConversion_70129 {
    public static void main(String[] args) {
        String s = "110010101001";

        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int cnt = 0, removeZeroCnt = 0;

        while(s.length() > 1) {
            int beforeLength = s.length();

            s = s.replaceAll("0", "");

            removeZeroCnt += beforeLength - s.length();

            s = Integer.toBinaryString(s.length());
            cnt++;
        }

        return new int[] {cnt, removeZeroCnt};
    }
}
