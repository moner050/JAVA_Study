package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class MinRectangle_86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {5, 15}};
//        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {7, 11}};

        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int x = 0, y = 0;

        for (int i = 0; i < sizes.length; i++) {
            int tempX = Math.max(sizes[i][0], sizes[i][1]);
            int tempY = Math.min(sizes[i][0], sizes[i][1]);
            x = Math.max(x, tempX);
            y = Math.max(y, tempY);
        }

        return x * y;
    }
}
