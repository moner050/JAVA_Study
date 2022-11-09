package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class PYCount_12916 {

    public static void main(String[] args) {
//        String s = "pPoooyY";
        String s = "Pyy";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = false;
        int pCnt = 0, yCnt = 0;

        String[] arr = s.toLowerCase().split("");

        for (String text : arr) {
            if(text.equals("p")) pCnt++;
            else if(text.equals("y")) yCnt++;
        }

        if(pCnt == yCnt) answer = true;
        else answer = pCnt <= yCnt && pCnt >= yCnt;

        return answer;
    }
}
