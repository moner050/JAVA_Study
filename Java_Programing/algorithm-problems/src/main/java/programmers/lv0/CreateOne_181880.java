package programmers.lv0;


// 1로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181880
public class CreateOne_181880 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int cnt = 0;

        for (int num : num_list) {
            while(num != 1) {
                if(num % 2 == 0) num /= 2;
                else num = (num - 1) / 2;
                cnt++;
            }
        }

        return cnt;
    }
}
