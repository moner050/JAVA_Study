package programmers.lv0;

// 꼬리 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181841
public class TailString_181841 {
    public static void main(String[] args) {
        String[] str_list =  {"abc", "def", "ghi"};
        String ex = "ef";

        System.out.println(solution(str_list, ex));
    }

    public static String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();

        for (String str : str_list) {
            if(!str.contains(ex)) sb.append(str);
        }

        return sb.toString();
    }
}
