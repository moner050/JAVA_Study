package programmers.lv1;

import java.util.Stack;

// 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class SubString_140108 {
    public static void main(String[] args) {
//        String s = "banana";
        String s = "aaabbaccccabba";
//        String s = "abracadabra";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;

        while(s.length() != 0) {
            answer++;
            char fst = s.charAt(0);
            int fstCnt = 1, scdCnt = 0;

            for (int i = 1; i < s.length(); i++) {
                if(fst == s.charAt(i)) fstCnt++;
                else scdCnt++;

                if(fstCnt == scdCnt) break;

            }
            s = s.substring(fstCnt + scdCnt);
        }

        return answer;
    }
}
