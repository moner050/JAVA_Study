package programmers.lv0;

import java.math.BigInteger;
import java.util.Stack;

// 두 수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/181846
public class SumTwoNum_181846 {
    public static void main(String[] args) {
//        String a = "582", b = "734";
        String a = "18446744073709551615", b = "287346502836570928366";

        System.out.println(solution1(a, b));
        System.out.println(solution2(a, b));
    }

    public static String solution1(String a, String b) {
        if(a.length() > 9 || b.length() > 9) {
            int flag = 0;
            StringBuilder sb = new StringBuilder();
            Stack<String> result = new Stack<>();
            Stack<Integer> aStack = new Stack<>();
            Stack<Integer> bStack = new Stack<>();

            for (int i = 0; i < a.length(); i++) {
                aStack.push(Integer.parseInt(String.valueOf(a.charAt(i))));
            }
            for (int i = 0; i < b.length(); i++) {
                bStack.push(Integer.parseInt(String.valueOf(b.charAt(i))));
            }

            while(true) {
                if(aStack.isEmpty() && bStack.isEmpty()) break;

                int aTemp = aStack.isEmpty() ? 0 : aStack.pop();
                int bTemp = bStack.isEmpty() ? 0 : bStack.pop();

                int sum = aTemp + bTemp;

                if(flag > 0) {
                    flag = 0;
                    sum++;
                }

                if(sum >= 10) {
                    flag++;
                    sum %= 10;
                }

                result.push(String.valueOf(sum));
            }

            if(flag > 0) result.push("1");

            while(!result.isEmpty()) {
                sb.append(result.pop());
            }

            return sb.toString();
        }
        else return String.valueOf(Long.parseLong(a) + Long.parseLong(b));
    }

    public static String solution2(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}
