package programmers.lv0;

// 모음 제거
// https://school.programmers.co.kr/learn/courses/30/lessons/120849
public class RemoveVowel_120849 {
    public static void main(String[] args) {
//        String my_string = "bus";
        String my_string = "nice to meet you";

        System.out.println(solution1(my_string));
        System.out.println(solution2(my_string));
    }

    public static String solution1(String my_string) {
        String[] vowel = {"a", "e", "i", "o", "u"};

        for(String v : vowel) {
            my_string = my_string.replace(v, "");
        }
        return my_string;
    }

    public static String solution2(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
