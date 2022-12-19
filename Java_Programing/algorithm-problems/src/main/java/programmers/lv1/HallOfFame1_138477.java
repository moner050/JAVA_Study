package programmers.lv1;

import java.util.*;

// 명예의 전당
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class HallOfFame1_138477 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(Arrays.toString(solution1(k, score)));
        System.out.println(Arrays.toString(solution2(k, score)));
    }

    public static int[] solution1(int k, int[] score) {
        List<Integer> sList = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            if(sList.size() >= k) {
                int last = sList.get(sList.size() - 1);
                if(last < score[i]) {
                    sList.remove(sList.size() - 1);
                    sList.add(score[i]);
                }
            }
            else {
                sList.add(score[i]);
            }
            sList.sort(Collections.reverseOrder());
            answer[i] = sList.get(sList.size() - 1);
        }

        return answer;
    }

    public static int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for (int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);

            if(priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
}
