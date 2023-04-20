package programmers.lv0;

// 등차수열의 특정한 항만 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181931
public class AddParticularNumber_181931 {
    public static void main(String[] args) {
        int a = 3, d = 4;
        boolean[] included = {true, false, false, true, true};

        System.out.println(solution(a, d, included));
    }

    public static int solution(int a, int d, boolean[] included) {
        int result = 0;

        for (boolean b : included) {
            if (b) result += a;
            a += d;
        }

        return result;
    }
}
