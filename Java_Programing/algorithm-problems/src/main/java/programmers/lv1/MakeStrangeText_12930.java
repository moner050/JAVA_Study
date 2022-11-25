package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class MakeStrangeText_12930 {
    public static void main(String[] args) {
//        String s = "try hello world";
        String s = "  tRy hello  WORLD    ";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] temp = s.split("");
        int cnt = 0;

        for (String text : temp) {
            cnt = text.contains(" ") ? 0 : cnt + 1;
            sb.append(cnt % 2 == 0 ? text.toLowerCase() : text.toUpperCase());
        }
        return sb.toString();
    }
}
