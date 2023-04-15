package programmers.lv0;

// 이어 붙인 수
// https://school.programmers.co.kr/learn/courses/30/lessons/181928
public class PutNumberTogether_181928 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int num : num_list) {
            if(num % 2 == 0) even.append(num);
            else odd.append(num);
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}
