package programmers.lv0;

// 접미사인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181908
public class CheckSuffix_181908 {
    public static void main(String[] args) {
        String my_string = "banana",  is_suffix = "ana";

        System.out.println(solution(my_string, is_suffix));
    }

    public static int solution(String my_string, String is_suffix) {
        return is_suffix.length() > my_string.length()
                ? 0 : my_string.substring(my_string.length() - is_suffix.length(), my_string.length()).equals(is_suffix)
                ? 1 : 0;
    }
}
