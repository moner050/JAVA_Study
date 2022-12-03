package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class IndexOfK_42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution1(array, commands)));
        System.out.println(Arrays.toString(solution2(array, commands)));
    }

    public static int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int num = 0; num < commands.length; num++) {
            ArrayList<Integer> tempNum = new ArrayList<>();
            int i = commands[num][0] - 1;
            int j = commands[num][1] - 1;
            int k = commands[num][2] - 1;

            for (int l = i; l <= j; l++) {
                tempNum.add(array[l]);
            }
            Collections.sort(tempNum);
            answer[num] = tempNum.get(k);
        }

        return answer;
    }

    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int num = 0; num < commands.length; num++) {
            int[] tempNum = Arrays.copyOfRange(array, commands[num][0]-1, commands[num][1]);
            Arrays.sort(tempNum);
            answer[num] = tempNum[commands[num][2] - 1];
        }
        return answer;
    }
}
