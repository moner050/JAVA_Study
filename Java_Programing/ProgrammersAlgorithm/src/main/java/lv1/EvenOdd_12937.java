package lv1;

public class EvenOdd_12937 {

    public static void main(String[] args) {

        System.out.println(solution(5));
    }
    public static String solution(int num) {
        String answer = (num % 2 == 0) ? "Even" : "Odd";
        return answer;
    }
}
