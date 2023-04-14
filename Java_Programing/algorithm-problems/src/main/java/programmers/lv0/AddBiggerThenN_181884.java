package programmers.lv0;

// n보다 커질 때까지 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class AddBiggerThenN_181884 {
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        System.out.println(solution(numbers, n));
    }

    public static int solution(int[] numbers, int n) {
        int result = 0;

        for (int num : numbers) {
            result += num;

            if(result > n) break;
        }

        return result;
    }
}
