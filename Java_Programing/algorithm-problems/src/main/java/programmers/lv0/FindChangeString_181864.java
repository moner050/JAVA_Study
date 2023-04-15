package programmers.lv0;

// 문자열 바꿔서 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181864
public class FindChangeString_181864 {
    public static void main(String[] args) {
        String myString = "ABBAA",  pat = "AABB";

        System.out.println(solution(myString, pat));
    }

    public static int solution(String myString, String pat) {
        return myString.replaceAll("A", "b")
                .replaceAll("B", "a")
                .toUpperCase()
                .contains(pat) ? 1 : 0;
    }
}
