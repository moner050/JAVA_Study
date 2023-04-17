package programmers.lv0;

// 간단한 식 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181865
public class SimpleCalculation_181865 {
    public static void main(String[] args) {
        String binomial = "43 + 12";

        System.out.println(solution(binomial));
    }

    public static int solution(String binomial) {
        int result = 0;
        String[] calculation = binomial.split(" ");

        if (calculation[1].equals("+")) result = Integer.parseInt(calculation[0]) + Integer.parseInt(calculation[2]);
        else if (calculation[1].equals("-")) result = Integer.parseInt(calculation[0]) - Integer.parseInt(calculation[2]);
        else result = Integer.parseInt(calculation[0]) * Integer.parseInt(calculation[2]);

        return result;
    }
}
