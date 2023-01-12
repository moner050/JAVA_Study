package programmers.lv2;

import java.util.*;

// 카펫
// https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Carpet_42842 {
    public static void main(String[] args) {
//        int brown = 10, yellow = 2;
        int brown = 8, yellow = 1;
//        int brown = 10, yellow = 2;

        System.out.println(Arrays.toString(solution1(brown, yellow)));
        System.out.println(Arrays.toString(solution2(brown, yellow)));
    }

    public static int[] solution1(int brown, int yellow) {
        int[] answer = new int[2];
        Queue<Integer> numQue = divisor(brown + yellow);

        while(!numQue.isEmpty()) {

            if(numQue.size() != 1) {
                int fst = numQue.poll();
                int lst = numQue.poll();

                if((fst - 2) * (lst - 2) == yellow) {
                    answer[0] = lst;
                    answer[1] = fst;
                }
            }
            else {
                int num = numQue.poll();

                if((num - 2) * (num - 2) == yellow) {
                    answer[0] = answer[1] = num;
                }
            }
        }

        return answer;
    }

    public static Queue<Integer> divisor(int num) {
        Queue<Integer> divisors = new ArrayDeque<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                divisors.add(i);
                if(num / i != i) divisors.add(num / i);
            }
        }

        return divisors;
    }

    public static int[] solution2(int brown, int yellow) {
        // 완성된 카펫의 가로 + 세로
        int a = (brown + 4) / 2;
        // 주어진 타일의 모든 개수
        int b = yellow + 2 * a - 4;

        // a 를 한 변으로 하는 정사각형을 만든 후 정사각형의 네 귀퉁이를 자른 정사각형의 한변의 길이
        double sqrt = Math.sqrt(a * a - 4 * b);

        // 가로와 세로를 더한 값에 차이를 더해주고 2로 나눠주기, 가로와 세로를 더한 값에 차이를 빼주고 2로 나눠주기
        return new int[] {(int)(a + sqrt) / 2, (int)(a - sqrt) / 2};
    }
}
