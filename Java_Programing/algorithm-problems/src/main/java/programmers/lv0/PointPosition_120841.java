package programmers.lv0;

// 점의 위치 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120841
public class PointPosition_120841 {
    public static void main(String[] args) {
//        int[] dot = {2, 4};
        int[] dot = {-7, 9};

        System.out.println(solution1(dot));
        System.out.println(solution2(dot));
    }
    public static int solution1(int[] dot) {
        if(dot[0] > 0) {
            if(dot[1] > 0) return 1;
            else return 4;
        }
        else {
            if(dot[1] > 0) return 2;
            else return 3;
        }
    }

    public static int solution2(int[] dot) {
        return dot[0] > 0 && dot[1] > 0 ? 1
                : dot[0] > 0 && dot[1] < 0 ? 4
                : dot[0] < 0 && dot[1] > 0 ? 2
                : 3;
    }
}
