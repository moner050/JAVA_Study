package programmers.lv0;

// 특정한 문자를 대문자로 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181873
public class ChangeParticularChar_181873 {
    public static void main(String[] args) {
        String my_string = "programmers",  alp = "p";

        System.out.println(solution(my_string, alp));
    }

    public static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
