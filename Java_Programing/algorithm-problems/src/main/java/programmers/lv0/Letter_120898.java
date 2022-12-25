package programmers.lv0;

// 편지
// https://school.programmers.co.kr/learn/courses/30/lessons/120898
public class Letter_120898 {
    public static void main(String[] args) {
//        String message = "happy birthday!";
        String message = "I love you~";

        System.out.println(solution(message));
    }
    public static int solution(String message) {
        return message.length() * 2;
    }
}
