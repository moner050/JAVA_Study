package programmers.lv0;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

// 주사위 게임 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181916
public class DiceGame3_181916 {
    public static void main(String[] args) {
//        int a = 2, b = 2, c = 2, d = 2;
//        int a = 2, b = 2, c = 2, d = 2;
        int a = 6, b = 3, c = 3, d = 6;
//        int a = 2, b = 5, c = 2, d = 6;
//        int a = 6, b = 4, c = 2, d = 5;
//        int a = 1, b = 1, c = 1, d = 4;

        System.out.println(solution1(a, b, c, d));
        System.out.println(solution2(a, b, c, d));
    }

    public static int solution1(int a, int b, int c, int d) {
        int max = Integer.MIN_VALUE, maxKey = Integer.MIN_VALUE, min = Integer.MAX_VALUE, minKey = Integer.MAX_VALUE;
        Map<Integer, Integer> check = new HashMap<>();

        check.put(a, 1);
        check.put(b, check.getOrDefault(b, 0) + 1);
        check.put(c, check.getOrDefault(c, 0) + 1);
        check.put(d, check.getOrDefault(d, 0) + 1);

        if(check.size() == 2) {
            for (int key : check.keySet()) {
                if(check.get(key) > max) {
                    max = check.get(key);
                    maxKey = key;
                }
                if(check.get(key) < min) {
                    min = check.get(key);
                    minKey = key;
                }
            }

            if(max == 3) return (int) Math.pow((10 * maxKey + minKey), 2);
            else if(max == min) {
                int idx = 0;
                int[] value = new int[2];
                for (int key : check.keySet()) {
                    if(value[idx] != key) value[idx++] = key;
                }
                return (value[0] + value[1]) * (Math.abs(value[0] - value[1]));
            }

        }
        else if(check.size() == 3) {
            int rst = 1;
            for (int key : check.keySet()) {
                if(check.get(key) > max) {
                    max = check.get(key);
                    maxKey = key;
                }
            }

            for (int key : check.keySet()) {
                if(key != maxKey) rst *= key;
            }
            return rst;
        }
        else if(check.size() == 4) {
            int rst = Integer.MAX_VALUE;
            for (int num : check.keySet()) {
                if(rst > num) rst = num;
            }
            return rst;
        }

        return 1111 * a;
    }

    public static int solution2(int a, int b, int c, int d) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int data : new int[] {a, b, c, d}) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        PriorityQueue<Dice> pq = new PriorityQueue<>();

        for (int key : map.keySet()) {
            pq.add(new Dice(key, map.get(key)));
        }

        if(pq.size() == 1) return pq.poll().number * 1111;
        else if(pq.size() == 3) {
            pq.poll();
            result = Objects.requireNonNull(pq.poll()).number * Objects.requireNonNull(pq.poll()).number;
        }
        else if(pq.size() == 4) {
            pq.poll();pq.poll();pq.poll();
            result = Objects.requireNonNull(pq.poll()).number;
        }
        else {
            Dice firstNumber = pq.poll();
            Dice secondNumber = pq.poll();

            if(Objects.requireNonNull(firstNumber).count == 3) result = (int) Math.pow((10 * firstNumber.number + Objects.requireNonNull(secondNumber).number), 2);
            else {
                result = (Objects.requireNonNull(firstNumber).number + Objects.requireNonNull(secondNumber).number) * Math.abs(firstNumber.number - secondNumber.number);
            }
        }

        return result;
    }

    public static class Dice implements Comparable<Dice> {
        int number;
        int count;

        public Dice(int number, int count) {
            this.number = number;
            this.count = count;
        }

        @Override
        public int compareTo(Dice o) {
            if(this.count == o.count) {
                return o.number - this.number;
            }
            return o.count - this.count;
        }
    }
}
