package programmers.lv0;

// l로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181834
public class MakeL_181834 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";

        System.out.println(solution(myString));
    }

    public static String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) < 'l') sb.append('l');
            else sb.append(myString.charAt(i));
        }

        return sb.toString();
    }
}
