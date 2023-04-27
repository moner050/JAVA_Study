package programmers.lv0;

import java.util.Arrays;
import java.util.Stack;

// 배열 만들기 4
// https://school.programmers.co.kr/learn/courses/30/lessons/181918
public class CreateArr4_181918 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < arr.length; ) {
            if(result.isEmpty()) result.push(arr[i++]);
            else {
                if(result.peek() < arr[i]) result.push(arr[i++]);
                else result.pop();
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
