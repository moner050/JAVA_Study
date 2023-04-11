package programmers.lv0;

// 부분 문자열인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181843
public class CheckString_181843 {
    public static void main(String[] args) {
        String my_string = "banana", target = "ana";

        System.out.println(solution(my_string, target));
    }

    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
