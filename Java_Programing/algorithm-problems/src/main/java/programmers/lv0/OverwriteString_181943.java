package programmers.lv0;

// 문자열 겹쳐쓰기
// https://school.programmers.co.kr/learn/courses/30/lessons/181943
public class OverwriteString_181943 {
    public static void main(String[] args) {
//        String my_string = "He11oWor1d", overwrite_string = "lloWorl";
        String my_string = "Program29b8UYP", overwrite_string = "merS123";
//        int s = 2;
        int s = 7;

        System.out.println(solution(my_string, overwrite_string, s));
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length(), my_string.length());
    }
}
