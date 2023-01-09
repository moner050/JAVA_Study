package programmers.lv2;

// 피보나치 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class FibonacciNum_12945 {
    public static void main(String[] args) {
        int num = 3;

        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int num) {
        int result = -1, one = 1, two = 1;

        if(num == 1 || num == 2) return 1;

        else {
            for (int i = 3; i <= num; i++) {
                result = (one + two) % 1234567;
                one = two % 1234567;
                two = result % 1234567;
            }
        }

        return result;
    }
}
