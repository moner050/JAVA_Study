package programmers.lv2;

import java.util.*;

// 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586
public class FunctionDevelopment_42586 {
    public static void main(String[] args) {
//        int[] progresses = {93, 30, 55}, speeds ={1, 30, 5};
        int[] progresses = {95, 90, 99, 99, 80, 99}, speeds ={1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution1(progresses, speeds)));
        System.out.println(Arrays.toString(solution2(progresses, speeds)));
    }


    public static int[] solution1(int[] progresses, int[] speeds) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for(int n : progresses) {
            queue.add(n);
        }

        int result = 0, cnt = 1, idx = 0;
        while(!queue.isEmpty()) {
            if(queue.peek() + (cnt * speeds[idx]) >= 100) {
                queue.poll();
                result++;
                idx++;
            }
            else {
                if(result != 0) {
                    arrayList.add(result);
                    result = 0;
                }
                cnt++;
            }
        }

        if(result != 0) arrayList.add(result);

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int[] solution2(int[] progresses, int[] speeds) {
        int[] days = new int[100];
        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            while(progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            days[day]++;
        }

        return Arrays.stream(days).filter(num -> num != 0).toArray();
    }
}
