package programmers.lv0;

// 대문자와 소문자
// https://school.programmers.co.kr/learn/courses/30/lessons/120893
public class UpperAndLower_120893 {
    public static void main(String[] args) {
        String my_string = "cccCCC";

        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                sb.append(String.valueOf(c).toUpperCase());
            }
            else if(c >= 'A' && c <= 'Z') {
                sb.append(String.valueOf(c).toLowerCase());
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
