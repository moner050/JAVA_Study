package programmers.lv0;

// 부분 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181842
public class SubString_181842 {
    public static void main(String[] args) {
        String str1 = "abc", str2 = "aabcc";

        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
