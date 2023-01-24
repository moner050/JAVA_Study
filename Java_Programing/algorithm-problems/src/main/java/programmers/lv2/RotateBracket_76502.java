package programmers.lv2;

import java.util.Stack;

// 괄호 회전하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76502
public class RotateBracket_76502 {
    public static void main(String[] args) {
        String s = "[](){}";
//        String s = "[)(]";
//        String s = "}]()[{";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int result = 0;
        int sLength = s.length();
        s = s.repeat(2);

        for (int i = 0; i < sLength; i++) {
            boolean firstChk = true;
            Stack<Character> stack = new Stack<>();
            String temp = s.substring(i, sLength + i);

            for (char c : temp.toCharArray()) {
                if(stack.isEmpty()) {
                    if(c == '}' || c == ']' || c == ')') {
                        firstChk = false;
                        break;
                    }
                    else stack.push(c);
                }
                else {
                    if(bracketCheck(stack.peek(), c)) {
                        stack.pop();
                        while(true) {
                            if(stack.size() > 1) {
                                if(bracketCheck(stack.get(stack.size() - 2), stack.peek())) {
                                    stack.pop();
                                    stack.pop();
                                }
                                else break;
                            }
                            else break;
                        }
                    }
                    else stack.push(c);
                }
            }

            if(stack.isEmpty() && firstChk) result++;
        }

        return result;
    }

    public static boolean bracketCheck(char c1, char c2) {
        if(c1 == '{' && c2 == '}') return true;
        else if(c1 == '[' && c2 == ']') return true;
        else return c1 == '(' && c2 == ')';
    }
}
