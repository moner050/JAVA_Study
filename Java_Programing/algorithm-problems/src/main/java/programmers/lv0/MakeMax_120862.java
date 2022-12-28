package programmers.lv0;

// 최대값 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/120862
public class MakeMax_120862 {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, -3, 4, -5};
        int[] numbers = {0, -31, 24, 10, 1, 9};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if((numbers[i] * numbers[j]) > max) max = (numbers[i] * numbers[j]);
            }
        }
        return max;
    }
}
