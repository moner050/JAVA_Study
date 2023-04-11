package programmers.lv0;

// flag에 따라 다른 값 반환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181933
public class ChangeResultByFlag_181933 {
    public static void main(String[] args) {
        int a = -4, b = 7;
        boolean flag = true;

        System.out.println(solution(a, b, flag));
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
    }
}
