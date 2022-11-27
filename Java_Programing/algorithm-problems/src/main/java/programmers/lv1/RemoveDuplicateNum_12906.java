package programmers.lv1;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class RemoveDuplicateNum_12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        for (int num : solution(arr)) {
            System.out.print(num + " ");
        }
    }
    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(stack.peek() != arr[i]) stack.push(arr[i]);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
