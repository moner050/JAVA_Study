package programmers.lv1;

import java.util.Arrays;

// 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class GymSuit_42862 {
    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

//        int n = 3;
//        int[] lost = {3};
//        int[] reserve = {1};

        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int total = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌의 옷을 가져온 학생이 체육복을 잃어버렸으면 목록에서 제외
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    total++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 체육복을 도난당한 학생에게 체육복 빌려주기
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    total++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return total;
    }
}
