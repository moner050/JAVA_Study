package programmers.lv0;

// 겹치는 선분의 길이
// https://school.programmers.co.kr/learn/courses/30/lessons/120876
public class LengthOfOverlappingSegments_120876 {
    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};

        System.out.println(solution(lines));
    }

    public static int solution(int[][] lines) {
        int result = 0;
        int[] arr = new int[200];

        for (int[] line : lines) {
            int fst = line[0] + 100;
            int scd = line[1] + 100;

            for (int i = fst; i < scd; i++) {
                arr[i]++;
            }
        }

        for (int i = 100; i < arr.length; i++) {
            if(arr[i] > 1) result++;
        }

        return result;
    }
}
