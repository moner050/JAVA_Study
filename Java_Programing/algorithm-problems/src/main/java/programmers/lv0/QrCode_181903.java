package programmers.lv0;

// qr code
// https://school.programmers.co.kr/learn/courses/30/lessons/181903
public class QrCode_181903 {
    public static void main(String[] args) {
        int q = 3, r = 1;
        String code = "qjnwezgrpirldywt";

        System.out.println(solution(q, r ,code));
    }

    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if(i % q == r) sb.append(code.charAt(i));
        }

        return sb.toString();
    }
}
