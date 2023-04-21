package programmers.lv0;

// 0 떼기
// https://school.programmers.co.kr/learn/courses/30/lessons/181847
public class RemovePrefixZero_181847 {
    public static void main(String[] args) {
        String n_str = "0010";

        System.out.println(solution(n_str));
    }

    public static String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }
}
