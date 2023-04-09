package programmers.lv0;

// 길이에 따른 연산
// https://school.programmers.co.kr/learn/courses/30/lessons/181879
public class CalculationOfLength_181879 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int result = 0;

        if(num_list.length >= 11) {
            for (int num : num_list) {
                result += num;
            }
        }
        else {
            result = 1;
            for (int num : num_list) {
                result *= num;
            }
        }

        return result;
    }
}
