package programmers.lv2;

import java.util.Stack;

// 짝지어 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class RemovePairs_12973 {
    public static void main(String[] args) {
//        String s = "baabaa";
//        String s = "cdcd";
        String s = "abcda";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        Stack<Character> pairs = new Stack<>();

        for (char c : s.toCharArray()) {
            if(!pairs.isEmpty()) {
                if(pairs.peek() == c) pairs.pop();
                else pairs.push(c);
            }
            else pairs.push(c);
        }

        return pairs.isEmpty() ? 1 : 0;
    }
}
