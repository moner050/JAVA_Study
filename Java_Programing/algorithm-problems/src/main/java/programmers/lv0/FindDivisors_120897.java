package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 약수구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120897
public class FindDivisors_120897 {
    public static void main(String[] args) {
        int n = 24;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        List<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                divisorList.add(i);
                if(i != n / i) divisorList.add(n/i);
            }
        }
        return divisorList.stream().mapToInt(i -> i).sorted().toArray();
    }
}
