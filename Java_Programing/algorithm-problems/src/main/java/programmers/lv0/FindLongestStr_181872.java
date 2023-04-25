package programmers.lv0;

// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181872
public class FindLongestStr_181872 {
    public static void main(String[] args) {
        String myString = "AbCdEFG",  pat = "dE";

        System.out.println(solution(myString, pat));
    }

    public static String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);

        return myString.substring(0, idx + pat.length());
    }
}
