package programmers.lv1;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class TestMBTI2_118666 {

    public static void main(String[] args) {
//        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
//        int[] choices = {5, 3, 2, 7, 5};
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};

        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        char[][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> point = new HashMap<>();

        for (char[] t : type) {
            point.put(t[0], 0);
            point.put(t[1], 0);
        }

        for (int i = 0; i < choices.length; i++) {
            if(choices[i] > 4) {
                point.put(survey[i].charAt(1), point.get(survey[i].charAt(1)) + score[choices[i]]);
            }
            else {
                point.put(survey[i].charAt(0), point.get(survey[i].charAt(0)) + score[choices[i]]);
            }
        }

        for (char[] t : type) {
            sb.append(point.get(t[1]) <= point.get(t[0]) ? t[0] : t[1]);
        }

        return sb.toString();
    }
}
