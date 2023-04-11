package programmers.lv0;

// 원하는 문자열 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class FindString_181878 {
    public static void main(String[] args) {
        String myString = "AbCdEfG", pat = "aBc";

        System.out.println(solution(myString, pat));
    }

    public static int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
