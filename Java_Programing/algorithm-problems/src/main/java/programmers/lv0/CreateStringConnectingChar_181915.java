package programmers.lv0;

// 글자 이어 붙여 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181915
public class CreateStringConnectingChar_181915 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        System.out.println(solution(my_string, index_list));
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int idx : index_list) {
            sb.append(my_string.charAt(idx));
        }

        return sb.toString();
    }
}
