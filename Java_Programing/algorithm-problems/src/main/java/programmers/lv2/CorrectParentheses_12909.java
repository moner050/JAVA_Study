package programmers.lv2;

// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class CorrectParentheses_12909 {
    public static void main(String[] args) {
        String s = "()()";
//        String s = "(()(";

        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        int cnt = 0;

        for (char c : s.toCharArray()) {
            cnt += c == ')' ? -1 : 1;
            if(cnt < 0) return false;
        }

        return cnt == 0;
    }
}
