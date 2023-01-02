package programmers.lv0;

// 안전지대
// https://school.programmers.co.kr/learn/courses/30/lessons/120866
public class SafeZone_120866 {
    public static void main(String[] args) {
        int[][] board = {
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 1}};

//        int[][] board = {
//                {1},
//                {1}};

        System.out.println(solution1(board));
        System.out.println(solution2(board));
    }

    public static int solution1(int[][] board) {
        int cnt = 0;

        if(board.length * board[0].length == 1) {
            return board[0][0] == 1 ? 0 : 1;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    if(i == 0) {
                        for (int k = i; k <= i + 1; k++) {
                            if(j == 0) {
                                for (int l = j; l <= j + 1; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                            else if(j == board[i].length - 1) {
                                for (int l = j - 1; l <= j; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                            else {
                                for (int l = j - 1; l <= j + 1; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                        }
                    }
                    else if(i == board.length - 1) {
                        for (int k = i - 1; k <= i; k++) {
                            if(j == 0) {
                                for (int l = j; l <= j + 1; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                            else if(j == board[i].length - 1) {
                                for (int l = j - 1; l <= j; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                            else {
                                for (int l = j - 1; l <= j + 1; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                        }
                    }
                    else {
                        for (int k = i - 1; k <= i + 1; k++) {
                            if(j == 0) {
                                for (int l = j; l <= j + 1; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                            else if(j == board[i].length - 1) {
                                for (int l = j - 1; l <= j; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                            else {
                                for (int l = j - 1; l <= j + 1; l++) {
                                    if(board[k][l] != 1) board[k][l] = -1;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int[] ints : board) {
            for (int anInt : ints) {
                if (anInt == 0) cnt++;
            }
        }

        return cnt;
    }

    public static int solution2(int[][] board) {
        int cnt = 0;
        int[][] tempBoard = new int[board.length + 2][board[0].length + 2];

        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board[i - 1].length + 1; j++) {
                tempBoard[i][j] = board[i - 1][j - 1];
            }
        }


        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board[i - 1].length + 1; j++) {
                if(tempBoard[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if(tempBoard[k][j] != 1) tempBoard[k][j] = -1;
                        }
                    }
                }
            }
        }

        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board[i - 1].length + 1; j++) {
                if(tempBoard[i][j] == 0) cnt++;
            }
        }

        return cnt;
    }
}
