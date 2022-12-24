package programmers.lv0;

// 배열의 평균값
// https://school.programmers.co.kr/learn/courses/30/lessons/120817
public class ArrayAverage_120817 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(solution(numbers));
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers) {
            answer += num;
        }

        return answer / numbers.length;
    }
}
