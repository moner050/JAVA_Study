package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class DivisorCntSum_77884 {
    public static void main(String[] args) {
        int left = 13, right = 17;
//        int left = 24, right = 27;

        System.out.println(solution1(left, right));
        System.out.println(solution2(left, right));
    }

    public static int solution1(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;

            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    cnt++;
                    if(i / j != j) cnt++;
                }
            }
            answer += cnt % 2 == 0 ? i : -1 * i;
        }
        return answer;
    }

    public static int solution2(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if(i % Math.sqrt(i) == 0) answer -= i;
            else answer += i;
        }
        return answer;
    }
}
