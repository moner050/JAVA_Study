package programmers.lv0;

// 숨어있는 숫자의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120864
public class SumOfHideNum_120864 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        int result = 0;
        String[] strings = my_string.split("[^0-9]");

        for (String s : strings) {
            if(!s.isEmpty()) result += Integer.parseInt(s);
        }

        return result;
    }
}
