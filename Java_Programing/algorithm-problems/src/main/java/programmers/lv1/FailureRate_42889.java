package programmers.lv1;

import java.util.Arrays;

// 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class FailureRate_42889 {
    public static void main(String[] args) {
//        final int N = 5;
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        final int N = 4;
        int[] stages = {4,4,4,4,4};

        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] check = new int[N];
        double stageLength = stages.length;

        stages = Arrays.stream(stages).sorted().toArray();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (int) stageLength; j++) {
                if(stages[j] == i + 1) check[i]++;
            }
        }

        double[] result = new double[N];
        for(int i = 0; i < N; i++) {
            int tempNum = check[i];
            result[i] = stageLength == 0 ? 0 : (double) (tempNum / stageLength);
            stageLength -= tempNum;
        }

        double max = 0;
        int target = 1;
        for (int i = 0; i < N; i++) {
            max = result[0];
            target = 1;
            for (int j = 0; j < N; j++) {
                if(result[j] > max) {
                    max = result[j];
                    target = j + 1;
                }
            }
            result[target - 1] = -1;
            answer[i] = target;
        }

        return answer;
    }
}
