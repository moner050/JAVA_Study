package programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

// 외계어 사전
// https://school.programmers.co.kr/learn/courses/30/lessons/120869
public class DictionaryOfAlienLanguage_120869 {
    public static void main(String[] args) {
//        String[] spell = {"p", "o", "s"};
//        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        System.out.println(solution1(spell, dic));
        System.out.println(solution2(spell, dic));
    }

    public static int solution1(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            boolean chk = true;

            for (int j = 0; j < spell.length; j++) {
                if (!dic[i].contains(spell[j])) {
                    chk = false;
                    break;
                }
            }

            if(chk) return 1;
        }
        return 2;
    }

    public static int solution2(String[] spell, String[] dic) {
        return Arrays.stream(dic)
                .map(s -> s.chars()
                        .sorted()
                        .mapToObj(i -> String.valueOf((char) i))
                        .collect(Collectors.joining()))
                .collect(Collectors.toList())
                        .contains(Arrays.stream(spell)
                                .sorted()
                                .collect(Collectors.joining()))
                ? 1 : 2;
    }
}
