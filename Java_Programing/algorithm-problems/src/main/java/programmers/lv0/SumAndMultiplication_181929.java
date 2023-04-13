package programmers.lv0;

// 원소들의 곱과 합
// https://school.programmers.co.kr/learn/courses/30/lessons/181929
public class SumAndMultiplication_181929 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int multiplication = 1, sum = 0;

        for (int num : num_list) {
            multiplication *= num;
            sum += num;
        }

        return multiplication < Math.pow(sum, 2) ? 1 : 0;
    }
}
