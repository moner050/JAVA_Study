package programmers.lv0;

// 두 수의 연산값 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181938
public class CompareResult_181938 {
    public static void main(String[] args) {
        int a = 2, b = 91;

        System.out.println(solution(a ,b));
    }

    public static int solution(int a, int b) {
        int result1 = Integer.parseInt((String.valueOf(a)+String.valueOf(b)));
        int result2 = 2 * a * b;

        return Math.max(result1, result2);
    }
}
