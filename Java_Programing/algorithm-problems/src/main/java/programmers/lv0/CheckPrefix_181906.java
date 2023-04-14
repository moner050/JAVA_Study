package programmers.lv0;

// 접두사인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class CheckPrefix_181906 {
    public static void main(String[] args) {
        String my_string = "banana",  is_prefix = "ban";

        System.out.println(solution(my_string, is_prefix));
    }

    public static int solution(String my_string, String is_prefix) {
        return my_string.indexOf(is_prefix) == 0 ? 1 : 0;
    }
}
