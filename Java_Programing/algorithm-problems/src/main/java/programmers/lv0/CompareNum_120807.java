package programmers.lv0;

// 숫자 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120807
public class CompareNum_120807 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3;
        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}

