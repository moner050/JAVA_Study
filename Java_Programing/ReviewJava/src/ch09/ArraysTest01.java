package ch09;

import java.util.Arrays;

public class ArraysTest01 {
    public static void main(String[] args) {
        int[] scoreList = {83, 74, 65, 99, 92};
        Arrays.sort(scoreList);

        System.out.println("[ 점수 목록 ]");
        for (int score : scoreList)
        {
            System.out.print("[" + score + "] ");
        }

        System.out.println("\n");
        int[] copyList = Arrays.copyOf(scoreList, 10);
        System.out.println("[ 복사된 점수 목록 ]");
        for (int score : copyList)
        {
            System.out.print("[" + score + "] ");
        }
    }

}
