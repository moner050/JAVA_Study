package programmers.lv0;

// 문자열 섞기
// https://school.programmers.co.kr/learn/courses/30/lessons/181942
public class MixString_181942 {
    public static void main(String[] args) {
        String str1 = "aaaaa", str2 = "bbbbb";

        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return sb.toString();
    }
}
