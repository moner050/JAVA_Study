package programmers.lv0;

// 첫 번째로 나오는 음수
// https://school.programmers.co.kr/learn/courses/30/lessons/181896
public class FirstMinusNum_181896 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int result = -1;

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) return i;
        }

        return result;
    }
}
