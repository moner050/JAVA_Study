package programmers.lv0;

// 정수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181840
public class FindInteger_181840 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;

        System.out.println(solution(num_list, n));
    }

    public static int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) return 1;
        }

        return 0;
    }
}
