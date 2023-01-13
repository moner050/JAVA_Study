package programmers.lv2;

import java.util.Arrays;
import java.util.Stack;

// 영어 끝말잇기
// https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class EnglishEnding_12981 {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//        int n = 2;
//        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        System.out.println(Arrays.toString(solution(n, words)));
    }

    public static int[] solution(int n, String[] words) {
        Stack<String> wordList = new Stack<>();
        int cnt = 1, myCnt = 1;

        for(String text : words) {
            if(cnt > n) {
                cnt = 1;
                myCnt++;
            }

            if(wordList.contains(text)) return new int[] {cnt, myCnt};
            else {
                if(!wordList.isEmpty() && wordList.peek().charAt(wordList.peek().length() - 1) != text.charAt(0)) {
                    return new int[] {cnt, myCnt};
                }
                else wordList.add(text);
            }

            cnt++;
        }

        return new int[] {0, 0};
    }

}
