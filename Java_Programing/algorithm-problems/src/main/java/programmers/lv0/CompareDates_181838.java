package programmers.lv0;

// 날짜 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181838
public class CompareDates_181838 {
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28}, date2 = {2021, 12, 29};

        System.out.println(solution(date1, date2));
    }

    public static int solution(int[] date1, int[] date2) {
        int d1 = Integer.parseInt(String.valueOf(date1[0]) + String.valueOf(date1[1]) + String.valueOf(date1[2]));
        int d2 = Integer.parseInt(String.valueOf(date2[0]) + String.valueOf(date2[1]) + String.valueOf(date2[2]));

        return d1 < d2 ? 1 : 0;
    }
}
