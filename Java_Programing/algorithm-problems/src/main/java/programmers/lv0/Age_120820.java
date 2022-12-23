package programmers.lv0;

// 나이 출력
// https://school.programmers.co.kr/learn/courses/30/lessons/120820
public class Age_120820 {
    public static void main(String[] args) {
        int age = 23;
//        int age = 40;
        System.out.println(solution(age));
    }

    public static int solution(int age) {
        return 2022 - age + 1;
    }
}

