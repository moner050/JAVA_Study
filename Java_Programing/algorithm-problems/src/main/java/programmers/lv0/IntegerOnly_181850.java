package programmers.lv0;

// 정수 부분
// https://school.programmers.co.kr/learn/courses/30/lessons/181850
public class IntegerOnly_181850 {
    public static void main(String[] args) {
        double flo = 1.42;

        System.out.println(solution(flo));
    }

    public static int solution(double flo) {
        return (int) flo;
    }
}
