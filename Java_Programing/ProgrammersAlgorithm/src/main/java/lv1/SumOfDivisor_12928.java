package lv1;

public class SumOfDivisor_12928 {
    public static void main(String[] args) {
        System.out.println(solution1(12));
        System.out.println(solution2(12));
    }

    public static int solution1(int num) {
        int answer = 0;
        for (int i = 1; i <= num ; i++) {
            if(num % i == 0) answer += i;
        }
        return answer;
    }

    public static int solution2(int num) {
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(num) ; i++) {
            if(num % i == 0) {
                answer += i;
                if(num / i != i) {
                    answer += (num / i);
                }
            }
        }
        return answer;
    }
}
