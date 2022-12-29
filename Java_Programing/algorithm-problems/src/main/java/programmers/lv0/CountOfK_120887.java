package programmers.lv0;

// k의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120887
public class CountOfK_120887 {
    public static void main(String[] args) {
        int i= 1, j = 13, k = 1;

        System.out.println(solution1(i, j, k));
        System.out.println(solution2(i, j, k));
    }

    public static int solution1(int i, int j, int k) {
        int result = 0;
        for(; i <= j; i++) {
            for(String s : String.valueOf(i).split("")) {
                if(s.equals(String.valueOf(k))) result++;
            }
        }
        return result;
    }

    public static int solution2(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();

        for(; i <= j; i++) {
            sb.append(i);
        }

        return sb.length() - sb.toString().replace(String.valueOf(k), "").length();
    }
}
