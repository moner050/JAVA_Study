package programmers.lv0;

// 문자열안에 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/120908
public class StrInStr_120908 {
    public static void main(String[] args) {
//        String str1 = "ab6CDE443fgh22iJKlmn1o";
//        String str2 = "6CD";
        String str1 = "ppprrrogrammers";
        String str2 = "pppp";

        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
