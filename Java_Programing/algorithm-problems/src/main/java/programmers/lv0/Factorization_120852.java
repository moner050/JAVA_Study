package programmers.lv0;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// 소인수분해
// https://school.programmers.co.kr/learn/courses/30/lessons/120852
public class Factorization_120852 {
    public static void main(String[] args) {
        int n = 12;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        Set<Integer> numSet = new TreeSet<>();
        int num = 2;

        while(n != 1) {
            if(n % num == 0) {
                n = n / num;
                numSet.add(num);
            }
            else {
                num++;
            }
        }

        return numSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
