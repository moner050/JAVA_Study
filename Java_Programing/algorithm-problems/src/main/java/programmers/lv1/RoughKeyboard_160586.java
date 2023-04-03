package programmers.lv1;

import java.util.Arrays;

// 대충 만든 자판
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class RoughKeyboard_160586 {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"}, targets = {"ABCD", "AABB"};

        System.out.println(Arrays.toString(solution(keymap, targets)));
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                int chk = Integer.MAX_VALUE;

                for (int k = 0; k < keymap.length; k++) {
                    if(keymap[k].contains(String.valueOf(targets[i].charAt(j))) && chk > keymap[k].indexOf(targets[i].charAt(j)) + 1)
                    {
                        chk = keymap[k].indexOf(targets[i].charAt(j)) + 1;
                    }
                }

                if(chk == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                else sum += chk;
            }
            if(answer[i] != -1) answer[i] = sum;
        }

        return answer;
    }
}
