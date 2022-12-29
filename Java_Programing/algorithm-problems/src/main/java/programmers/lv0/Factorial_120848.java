package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

// 팩토리얼
// https://school.programmers.co.kr/learn/courses/30/lessons/120848
public class Factorial_120848 {
    public static void main(String[] args) {
//        int n = 3628800;
//        int n = 7;
        int n = 5;
        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= 15; i++) {
            list.add(list.get(i - 1) * (i + 1));
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int left = list.get(i);
            int right = list.get(i + 1);

            if(left == n) return i + 1;
            else if(right == n) return i + 2;
            else if(left <= n && right > n) return i + 1;
        }
        return 1;
    }

    public static int solution2(int n) {
        int factorial = 1;
        int i = 0;

        while(factorial <= n) {
            factorial *= i++ + 1;
        }

        return i - 1;
    }

}
