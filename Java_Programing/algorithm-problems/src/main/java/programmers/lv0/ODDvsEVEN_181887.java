package programmers.lv0;

// 홀수 vs 짝수
// https://school.programmers.co.kr/learn/courses/30/lessons/181887
public class ODDvsEVEN_181887 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int odd = 0, even = 0;

        for (int i = 1; i <= num_list.length; i++) {
            if(i % 2 == 0) even += num_list[i - 1];
            else odd += num_list[i - 1];
        }

        return Math.max(odd, even);
    }
}
