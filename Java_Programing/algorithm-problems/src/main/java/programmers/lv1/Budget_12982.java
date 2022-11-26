package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class Budget_12982 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution(d, budget));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int price : d) {
            if(budget - price >= 0) {
                budget -= price;
                answer++;
            }
            else break;
        }
        return answer;
    }
}
