package programmers.lv0;

// 특별한 이차원 배열 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181831
public class SpecialTwoDimensionArr_181831 {
    public static void main(String[] args) {
        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};

        System.out.println(solution(arr));
    }

    public static int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]) return 0;
            }
        }

        return 1;
    }
}
