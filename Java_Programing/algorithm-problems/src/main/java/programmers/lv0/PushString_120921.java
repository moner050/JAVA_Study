package programmers.lv0;

// 문자열 밀기
// https://school.programmers.co.kr/learn/courses/30/lessons/120921
public class PushString_120921 {
    public static void main(String[] args) {
//        String A = "hello", B = "ohell";
        String A = "apple", B = "elppa";

        System.out.println(solution(A, B));
    }

    public static int solution(String A, String B) {
        return B.repeat(2).indexOf(A);
    }
}
