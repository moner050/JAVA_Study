package programmers.lv0;

// 대문자로 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181877
public class ChangeUpperCase_181877 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";

        System.out.println(solution(myString));
    }

    public static String solution(String myString) {
        return myString.toUpperCase();
    }
}
