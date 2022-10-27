package programmers.lv1;

import java.util.Arrays;

public class DigitSum_12931 {
    public static void main(String[] args) {
        System.out.println(solution(987));
    }

    public static int solution(int n){
        int answer = 0;
        String[] temp = String.valueOf(n).split("");
        int[] intTemp = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
        for(int num : intTemp){
            answer += num;
        }
        return answer;
    }
}
