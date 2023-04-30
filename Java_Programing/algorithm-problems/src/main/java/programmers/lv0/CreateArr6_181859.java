package programmers.lv0;

import java.util.Arrays;
import java.util.Stack;

// 배열 만들기 6
// https://school.programmers.co.kr/learn/courses/30/lessons/181859
public class CreateArr6_181859 {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 1, 0};
        int[] arr = {0, 1, 1, 0};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < arr.length;) {
            if(result.isEmpty()) result.push(arr[i++]);
            else if(result.peek() == arr[i]) {
                result.pop();
                i++;
            }
            else if(result.peek() != arr[i]) result.push(arr[i++]);
        }

        if(result.isEmpty()) return new int[]{-1};

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
