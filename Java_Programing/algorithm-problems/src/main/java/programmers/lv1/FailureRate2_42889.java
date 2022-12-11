package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class FailureRate2_42889 {
    public static void main(String[] args) {
//        final int N = 5;
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        final int N = 4;
        int[] stages = {4,4,4,4,4};

        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] stagePlayers = new int[N + 2];

        for (int stage : stages) {
            stagePlayers[stage] += 1;
        }

        int remainingPlayers = stages.length;
        List<Stage> remainStages = new ArrayList<>();
        for (int id = 1; id <= N; id++) {
            double failure = (double) stagePlayers[id] / remainingPlayers;
            remainingPlayers -= stagePlayers[id];

            Stage s = new Stage(id, failure);
            remainStages.add(s);
        }

        remainStages.sort(Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = remainStages.get(i).id;
        }

        return answer;
    }
}

class Stage implements Comparable<Stage> {

    public int id;
    public double failure;

    public Stage(int id, double failure) {
        this.id = id;
        this.failure = failure;
    }

    @Override
    public int compareTo(Stage o) {
        if(failure < o.failure) return -1;
        else if(failure > o.failure) return 1;
        return 0;
    }
}
