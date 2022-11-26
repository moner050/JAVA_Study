package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class KnightWeapon_136798 {
    public static void main(String[] args) {
        int number = 5, limit = 3, power = 2;
        System.out.println(solution(number, limit, power));
    }

    public static int solution(int number, int limit, int power) {
        int[] numbers = new int[number];
        int answer = 0;

        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= Math.sqrt(i+1); j++) {
                if ((i + 1) % j == 0) {
                    numbers[i]++;
                    if ((i + 1) / j != j) numbers[i]++;
                }
            }
        }

        for (int num : numbers) {
            answer = num > limit ? answer + power : answer + num;
        }
        return answer;
    }
}
