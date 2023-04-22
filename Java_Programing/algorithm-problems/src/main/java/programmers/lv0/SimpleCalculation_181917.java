package programmers.lv0;

// 간단한 논리 연산
// https://school.programmers.co.kr/learn/courses/30/lessons/181917
public class SimpleCalculation_181917 {
    public static void main(String[] args) {
        boolean x1 = false, x2 = true,  x3 = true,  x4 = true;

        System.out.println(solution(x1, x2, x3, x4));
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 | x2) & (x3 | x4);
    }
}
