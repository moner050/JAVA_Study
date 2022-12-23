package programmers.lv0;

// 각도기
// https://school.programmers.co.kr/learn/courses/30/lessons/120829
public class Angle_120829 {
    public static void main(String[] args) {
//        int angle = 70;
//        int angle = 91;
        int angle = 180;
        System.out.println(solution(angle));
    }

    public static int solution(int angle) {
        return angle == 180 ? 4 : angle == 90 ? 2 : angle < 90 ? 1 : 3;
    }
}

