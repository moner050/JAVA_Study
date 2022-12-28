package programmers.lv0;

// 369게임
// https://school.programmers.co.kr/learn/courses/30/lessons/120891
public class GameOf369_120891 {
    public static void main(String[] args) {
        int order = 3;

        System.out.println(solution(order));
    }

    public static int solution(int order) {
        return (int) String.valueOf(order).chars().filter(num -> num == '3' || num == '6' || num == '9').count();
    }
}
