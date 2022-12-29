package programmers.lv0;

import java.util.HashMap;

// 모스부호
// https://school.programmers.co.kr/learn/courses/30/lessons/120838
public class MorseCode_120838 {
    public static void main(String[] args) {
//        String letter = ".... . .-.. .-.. ---";
//        String letter = ".--. -.-- - .... --- -.";
        String letter = "--..";

        System.out.println(solution(letter));
    }

    public static String solution(String letter) {
        StringBuilder sb = new StringBuilder();

        int alphabet = 97;
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Character> morse = new HashMap<>();

        for (int i = 0; i <= 25; i++) {
            morse.put(morseCodes[i], (char) alphabet++);
        }

        for(String s : letter.split(" ")) {
            sb.append(morse.get(s));
        }

        return sb.toString();
    }
}
