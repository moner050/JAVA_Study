package programmers.lv2;

import java.util.*;

// 구명보트
// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class LifeBoat_42885 {
    public static void main(String[] args) {
//        int[] people = {70, 50, 80, 50};
        int[] people = {70, 80, 50};
//        int[] people = {60, 50, 55, 60, 40, 57, 48};
        int limit = 100;

        System.out.println(solution1(people, limit));
        System.out.println(solution2(people, limit));
    }

    public static int solution1(int[] people, int limit) {
        int cnt = 0;
        List<Integer> weightList = new ArrayList<>();
        Arrays.sort(people);

        for (int i = people.length - 1; i >= 0; i--) {
            weightList.add(people[i]);
        }

        Deque<Integer> deque = new ArrayDeque<>(weightList);

        while(!deque.isEmpty()) {
            int sum = deque.peekFirst() + deque.peekLast();

            if(sum > limit) {
                deque.pollFirst();
                cnt++;
            }
            else {
                deque.pollFirst();
                deque.pollLast();
                cnt++;
            }

            if(!deque.isEmpty()) {
                if(deque.peekLast() > Math.ceil((double) limit / 2)) break;
            }
        }

        return !deque.isEmpty() ? cnt + deque.size() : cnt;
    }

    public static int solution2(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;

        for (; i < j; --j) {
            if(people[i] + people[j] <= limit) ++i;
        }

        return people.length - i;
    }
}
