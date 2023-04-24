package programmers.lv0;

// 문자열이 몇 번 등장하는지 세기
// https://school.programmers.co.kr/learn/courses/30/lessons/181871
public class CountStr_181871 {
    public static void main(String[] args) {
        String myString = "banana",  pat = "ana";

        System.out.println(solution(myString, pat));
    }

    public static int solution(String myString, String pat) {
        int result = 0;

        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            String temp = myString.substring(i, pat.length() + i);
            if(pat.equals(temp)) result++;
        }

        return result;
    }
}
