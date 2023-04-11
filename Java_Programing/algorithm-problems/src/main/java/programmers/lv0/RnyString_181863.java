package programmers.lv0;

// rny_string
// https://school.programmers.co.kr/learn/courses/30/lessons/181863
public class RnyString_181863 {
    public static void main(String[] args) {
        String rny_string = "masterpiece";

        System.out.println(solution(rny_string));
    }

    public static String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}
