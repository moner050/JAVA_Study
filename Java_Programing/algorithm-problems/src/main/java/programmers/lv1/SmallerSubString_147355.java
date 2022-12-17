package programmers.lv1;

// 크기가 작은 부분 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class SmallerSubString_147355 {

    public static void main(String[] args) {
//        String t = "3141592";
//        String p = "271";

        String t = "10203";
        String p = "15";

        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        int answer = 0;

        long parseP = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long tempT = Long.parseLong(t.substring(i, p.length() + i));
            if(tempT <= parseP) answer++;
        }

        return answer;
    }
}
