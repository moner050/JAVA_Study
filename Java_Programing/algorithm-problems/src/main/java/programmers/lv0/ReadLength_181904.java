package programmers.lv0;

// 세로 읽기
// https://school.programmers.co.kr/learn/courses/30/lessons/181904
public class ReadLength_181904 {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4, c = 2;

        System.out.println(solution(my_string, m, c));
    }

    public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i+=m) {
            sb.append(my_string.charAt(i+c-1));
        }

        return sb.toString();
    }
}
