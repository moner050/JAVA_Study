package programmers.lv1;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

// 달리기 대회
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
public class Running_178871 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"}, callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players, callings)));
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] result = new String[players.length];

        Map<Integer, String> sortMap = new TreeMap<>();
        Map<String, Integer> playerMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            sortMap.put(i + 1, players[i]);
            playerMap.put(players[i], i + 1);
        }

        for (int i = 0; i < callings.length; i++) {
            // 불린 선수의 등수를 불러옴
            int idx = playerMap.get(callings[i]);

            // 이전등수의 사람과 등수를 뒤바꿈.
            String prevPlayer = sortMap.get(idx - 1);
            int prevIdx = playerMap.get(prevPlayer);

            playerMap.put(callings[i], prevIdx);
            playerMap.put(prevPlayer, idx);
            sortMap.put(prevIdx, callings[i]);
            sortMap.put(idx, prevPlayer);
        }

        int resultIdx = 0;
        for (String p : sortMap.values()) {
            result[resultIdx++] = p;
        }

        return result;
    }
}
