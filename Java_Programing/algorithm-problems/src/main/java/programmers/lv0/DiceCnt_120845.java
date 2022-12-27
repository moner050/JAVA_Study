package programmers.lv0;

// 주사위의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120845
public class DiceCnt_120845 {
    public static void main(String[] args) {
//        int[] box = {1, 1, 1};
//        int n = 1;
        int[] box = {10, 8, 6};
        int n = 3;

        System.out.println(solution(box, n));
    }

    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
