package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class SuBackSu_12922 {
    public static void main(String[] args) {
        int n = 3;
//        int n = 4;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static String solution1(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
             sb.append(i % 2 != 0 ? "수" : "박");
        }
        return sb.toString();
    }

    public static String solution2(int n) {
        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }
}
