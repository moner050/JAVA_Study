package programmers.lv2;

import java.util.*;

// 프린터
// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Printer_42587 {
    public static void main(String[] args) {
//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int cnt = 0, result = 0;

        Queue<Paper> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            Paper p = new Paper(priorities[i], i);
            queue.offer(p);

            list.add(priorities[i]);
        }

        list.sort(Comparator.reverseOrder());
        int max = list.get(0);

        while(!queue.isEmpty()) {
            Paper paper = queue.poll();

            if(max == paper.pr) {
                list.remove(0);

                if(!queue.isEmpty() && !list.isEmpty()) {
                    max = list.get(0);
                }

                cnt++;

                if(paper.lo == location) result = cnt;
            }
            else queue.offer(paper);
        }

        return result;
    }

    static class Paper {
        public int pr;
        public int lo;

        public Paper(int pr, int lo) {
            this.pr = pr;
            this.lo = lo;
        }
    }
}
