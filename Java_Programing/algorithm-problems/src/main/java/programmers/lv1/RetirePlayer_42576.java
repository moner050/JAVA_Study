package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

// 완주하지 못한 선수
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class RetirePlayer_42576 {
    public static void main(String[] args) {
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution1(participant, completion));
        System.out.println(solution2(participant, completion));
    }

    public static String solution1(String[] participant, String[] completion) {
        String result = "";
        HashMap<String, Integer> map = new HashMap<>();

        // 동명이인 있으면 value++
        for (int i = 0; i < participant.length; i++) {
            if(map.containsKey(participant[i])) {
                int idx = map.get(participant[i]);
                map.replace(participant[i], ++idx);
            }
            else {
                map.put(participant[i], 1);
            }
        }

        // 완주한 선수들을 참가자 목록에서 지우기.
        for (int i = 0; i < completion.length; i++) {
            if(map.containsKey(completion[i])) {
                int idx = map.get(completion[i]);
                if(idx <= 1) {
                    map.remove(completion[i]);
                }
                else {
                    map.replace(completion[i], --idx);
                }
            }
        }

        for (String n : map.keySet()) {
            result = n;
        }

        return result;
    }

    public static String solution2(String[] participant, String[] completion) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion) map.put(player, map.get(player) - 1);

        for (String key : map.keySet()) {
            if(map.get(key) != 0) {
                result = key;
                break;
            }
        }

        return result;
    }
}
