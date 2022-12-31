package programmers.lv0;

// 직사각형의 넓이 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120860
public class AreaOfRectangle_120860 {
    public static void main(String[] args) {
//        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        int xMin = Integer.MAX_VALUE, yMin = Integer.MAX_VALUE, xMax = Integer.MIN_VALUE, yMax = Integer.MIN_VALUE;

        for (int[] dot : dots) {
            if (xMin > dot[0]) xMin = dot[0];
            if (yMin > dot[1]) yMin = dot[1];
            if (xMax < dot[0]) xMax = dot[0];
            if (yMax < dot[1]) yMax = dot[1];
        }

        int x = Math.abs(xMax - xMin);
        int y = Math.abs(yMax - yMin);

        return x * y;
    }
}
