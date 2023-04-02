package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 추억 점수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class MemoryScore_176963 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int idx = 0;
        int[] result = new int[photo.length];
        Map<String, Integer> scores = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            scores.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int tempScore = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if(scores.containsKey(photo[i][j])) tempScore += scores.get(photo[i][j]);
            }
            result[idx++] = tempScore;
        }

        return result;
    }
}
