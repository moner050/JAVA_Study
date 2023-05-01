package programmers.lv0;

// 코드 처리하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181932
public class ProcessingCode_181932 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";

        System.out.println(solution(code));
    }

    public static String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if(mode == 0) {
                if(code.charAt(i) == '1') mode = 1;
                else {
                    if(i % 2 == 0) sb.append(code.charAt(i));
                }
            }
            else {
                if(code.charAt(i) == '1') mode = 0;
                else {
                    if(i % 2 == 1) sb.append(code.charAt(i));
                }
            }
        }

        return sb.toString().equals("") ? "EMPTY" : sb.toString();
    }
}
