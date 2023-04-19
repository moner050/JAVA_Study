package programmers.lv0;

// 9로 나눈 나머지
// https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class DividedByNine_181914 {
    public static void main(String[] args) {
        String number = "123";

        System.out.println(solution(number));
    }

    public static int solution(String number) {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            result += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return result % 9;
    }
}
