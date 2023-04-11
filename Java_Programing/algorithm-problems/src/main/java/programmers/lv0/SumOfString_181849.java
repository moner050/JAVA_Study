package programmers.lv0;

// 문자열 정수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/181849
public class SumOfString_181849 {
    public static void main(String[] args) {
        String num_str = "123456789";

        System.out.println(solution(num_str));
    }

    public static int solution(String num_str) {
        int result = 0;
        for (String num : num_str.split("")) {
            result += Integer.parseInt(num);
        }
        return result;
    }
}
