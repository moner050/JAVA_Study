package programmers.lv0;

// 공 던지기
// https://school.programmers.co.kr/learn/courses/30/lessons/120843
public class ThrowBall_120843 {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4};
//        int k = 2;
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        int k = 5;
        int[] numbers = {1, 2, 3};
        int k = 3;

        System.out.println(solution(numbers, k));
    }

    public static int solution(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }
}
