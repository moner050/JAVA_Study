package programmers.lv0;

import java.util.Arrays;

// 캐릭터의 좌표
// https://school.programmers.co.kr/learn/courses/30/lessons/120861
public class CharacterCoordinates_120861 {
    public static void main(String[] args) {
//        String[] keyinput = {"left", "right", "up", "right", "right"};
//        int[] boar = {11, 11};
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] boar = {7, 9};

        System.out.println(Arrays.toString(solution1(keyinput, boar)));
        System.out.println(Arrays.toString(solution2(keyinput, boar)));
    }

    public static int[] solution1(String[] keyinput, int[] board) {
        int[] result = new int[2];
        int col = (board[0] - 1) / 2;
        int row = (board[1] - 1) / 2;

        for (String s : keyinput) {
            switch (s) {
                case "left":
                    result[0]--;
                    break;
                case "right":
                    result[0]++;
                    break;
                case "up":
                    result[1]++;
                    break;
                case "down":
                    result[1]--;
                    break;
            }
            if (Math.abs(result[0]) > Math.abs(col)){
                if(result[0] < 0) result[0]++;
                else result[0]--;
            }
            else if (Math.abs(result[1]) > Math.abs(row)) {
                if(result[1] < 0) result[1]++;
                else result[1]--;
            }
        }

        return result;
    }

    public static int[] solution2(String[] keyinput, int[] board) {
        int[] result = new int[2];

        for (String s : keyinput) {
            switch (s) {
                case "left":
                    result[0] -= result[0] > -(board[0] / 2) ? 1 : 0;
                    break;
                case "right":
                    result[0] += result[0] < (board[0] / 2) ? 1 : 0;
                    break;
                case "up":
                    result[1] += result[1] < (board[1] / 2) ? 1 : 0;
                    break;
                case "down":
                    result[1] -= result[1] > -(board[1] / 2) ? 1 : 0;
                    break;
            }
        }

        return result;
    }
}
