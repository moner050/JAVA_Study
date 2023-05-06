package programmers.lv2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 연속 부분 수열 합의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/131701
public class SumNumArr_131701 {
    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};

        System.out.println(solution(elements));
    }

    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] doubleElements = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            doubleElements[i] = doubleElements[i + elements.length] = elements[i];
        }

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                set.add(Arrays.stream(doubleElements, j, j+i).sum());
            }
        }

        return set.size();
    }
}
