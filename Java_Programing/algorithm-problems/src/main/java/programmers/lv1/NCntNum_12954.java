package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class NCntNum_12954 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        for (long l : solution(x, n)) {
            System.out.print(l + " ");
        }
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }
}
