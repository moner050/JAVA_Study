package programmers.lv0;

// 이차원 배열 대각선 순회하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181829
public class TwoDimension_181829 {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int k = 2;

        System.out.println(solution(board, k));
    }

    public static int solution(int[][] board, int k) {
        int result = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i + j <= k) result += board[i][j];
            }
        }
        return result;
    }
}
