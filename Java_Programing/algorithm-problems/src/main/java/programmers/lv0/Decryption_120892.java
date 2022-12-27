package programmers.lv0;

// 암호 해독
// https://school.programmers.co.kr/learn/courses/30/lessons/120892
public class Decryption_120892 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        System.out.println(solution(cipher, code));
    }
    public static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}
