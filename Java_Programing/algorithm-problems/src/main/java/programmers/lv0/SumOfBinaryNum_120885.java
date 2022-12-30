package programmers.lv0;

import java.math.BigInteger;

// 이진수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120885
public class SumOfBinaryNum_120885 {
    public static void main(String[] args) {
        String bin1 = "10", bin2 = 	"11";

        System.out.println(solution1(bin1, bin2));
        System.out.println(solution2(bin1, bin2));
    }

    public static String solution1(String bin1, String bin2) {
        BigInteger num1 = new BigInteger(bin1, 2);
        BigInteger num2 = new BigInteger(bin2, 2);

        BigInteger result = num1.add(num2);

        return result.toString(2);
    }

    public static String solution2(String bin1, String bin2) {
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
    }
}
