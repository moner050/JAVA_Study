package programmers.lv0;

// 소문자로 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181876
public class ChangeLowerCase_181876 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";

        System.out.println(solution(myString));
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }
}
