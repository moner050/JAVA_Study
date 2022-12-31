package programmers.lv0;

import java.util.Stack;

// 컨트롤 제트
// https://school.programmers.co.kr/learn/courses/30/lessons/120853
public class CtrlZ_120853 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (String str : s.split(" ")) {
            if (str.equals("Z")) stack.pop();
            else stack.push(Integer.parseInt(str));
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}
