package programmers.lv2;

import java.util.Arrays;

// 최솟값 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12941
public class MakeMinValue_12941 {
    public static void main(String[] args) {
//        int [] A = {1, 4, 2}, B = {5, 4, 4};
        int [] A = {1, 2}, B = {3, 4};

        System.out.println(solution(A, B));
    }

    public static int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int reverse = B.length - 1;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[reverse--];
        }

        return answer;
    }
}
