package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class PYCount_12916 {

    public static void main(String[] args) {
        String s = "pPoooyY";
//        String s = "Pyy";
        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }

    public static boolean solution1(String s) {
        int pCnt = 0, yCnt = 0;

        String[] arr = s.toLowerCase().split("");

        for (String text : arr) {
            if(text.equals("p")) pCnt++;
            else if(text.equals("y")) yCnt++;
        }

        return pCnt == yCnt;
    }

    public static boolean solution2(String s) {
        s = s.toLowerCase();

        return s.chars().filter( c -> 'p' == c ).count() == s.chars().filter( c -> 'y' == c).count();
    }
}
