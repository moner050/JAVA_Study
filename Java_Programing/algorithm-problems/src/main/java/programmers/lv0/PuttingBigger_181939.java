package programmers.lv0;

// 더 크게 합치기
// https://school.programmers.co.kr/learn/courses/30/lessons/181939
public class PuttingBigger_181939 {
    public static void main(String[] args) {
        int a = 9, b = 91;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(a).append(b);
        sb2.append(b).append(a);

        int result1 = Integer.parseInt(sb1.toString());
        int result2 = Integer.parseInt(sb2.toString());

        return Math.max(result1, result2);
    }
}
