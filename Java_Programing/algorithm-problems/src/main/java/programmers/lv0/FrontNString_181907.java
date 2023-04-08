package programmers.lv0;

// 문자열의 앞의 n글자
// https://school.programmers.co.kr/learn/courses/30/lessons/181907
public class FrontNString_181907 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;

        System.out.println(solution(my_string, n));
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
