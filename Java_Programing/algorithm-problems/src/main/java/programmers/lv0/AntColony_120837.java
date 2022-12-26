package programmers.lv0;

// 개미 군단
// https://school.programmers.co.kr/learn/courses/30/lessons/120837
public class AntColony_120837 {
    public static void main(String[] args) {
//        int hp = 23;
        int hp = 24;
//        int hp = 999;

        System.out.println(solution(hp));
    }

    public static int solution(int hp) {
        return (hp / 5) + ((hp % 5) / 3) + (((hp % 5) % 3));
    }

}
