package programmers.lv0;

// 특정 문자 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120826
public class RemoveStr_120826 {
    public static void main(String[] args) {
//        String my_string = "abcdef";
//        String letter = "f";
        String my_string = "BCBdbe";
        String letter = "B";

        System.out.println(solution1(my_string, letter));
        System.out.println(solution2(my_string, letter));
    }
    public static String solution1(String my_string, String letter) {
        char str = letter.toCharArray()[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != str) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String solution2(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
