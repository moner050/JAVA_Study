package programmers.lv0;

// 두 수의 나눗셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120806
public class Division_120806 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 2;
        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        return (int)(((double) num1 / num2) * 1000);
    }
}

