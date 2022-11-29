package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class CaesarCipher_12926 {
    public static void main(String[] args) {
//        String s = "AB";
//        String s = "z";
//        int n = 1;
//        String s = "a B z";
//        String s = "WXY";
        String s = "abcdefghijklmnopqrstuvwxy";
        int n = 4;

        System.out.println(solution(s, n));
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            else if(Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }

            sb.append(ch);
        }
        return sb.toString();
    }
}
