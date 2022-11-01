package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class ColaProblem_132267 {

    public static void main(String[] args) {

//        int a = 2;
        int a = 3;
        int b = 1;
        int n = 20;

        System.out.println(solution(a, b, n));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a) {
            answer += ((n/a) * b);
            n = (((n/a) * b) + (n%a));
        }

        return answer;
    }
}
