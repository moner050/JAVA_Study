package programmers.lv0;

// 문자 리스트를 문자열로 변환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181941
public class StringListToString_181941 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};

        System.out.println(solution(arr));
    }

    public static String solution(String[] arr) {
        return String.join("", arr);
    }
}
