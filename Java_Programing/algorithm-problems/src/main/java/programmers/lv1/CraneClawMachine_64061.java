package programmers.lv1;

import java.util.Stack;

// 크레인 인형뽑기 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class CraneClawMachine_64061 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},
                         {0,0,1,0,3},
                         {0,2,5,0,1},
                         {4,2,4,4,2},
                         {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> tempStack = new Stack<>();

        for (int move : moves) {
            int beforeNum = -1;
            if (!tempStack.empty()) {
                beforeNum = tempStack.peek();
            }

            for (int i = 0; i < board.length; i++) {
                if(board[i][move - 1] != 0) {
                    if(beforeNum == board[i][move - 1]) {
                        answer += 2;
                        tempStack.pop();
                    }
                    else {
                        tempStack.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
