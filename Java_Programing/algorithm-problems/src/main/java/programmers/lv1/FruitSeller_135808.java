package programmers.lv1;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class FruitSeller_135808 {

    public static void main(String[] args) {
//        int k = 3;
//        int m = 4;
//        int[] score = {1, 2, 3, 1, 2, 3, 1};

        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(solution(k, m, score));
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        Stack<Integer> stack = new Stack<>();

        for (int j : score) {
            stack.add(j);
        }

        while(stack.size() >= m) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list.add(stack.pop());
            }
            int min = Collections.min(list);
            answer += (min * m);
        }
        return answer;
    }
}
