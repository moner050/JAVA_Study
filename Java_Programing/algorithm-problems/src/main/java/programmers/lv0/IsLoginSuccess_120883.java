package programmers.lv0;

import java.util.HashMap;
import java.util.Map;

// 로그인 성공?
// https://school.programmers.co.kr/learn/courses/30/lessons/120883
public class IsLoginSuccess_120883 {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        System.out.println(solution(id_pw, db));
    }

    public static String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbMap = new HashMap<>();

        for (String[] strings : db) {
            dbMap.put(strings[0], strings[1]);
        }

        if(!dbMap.containsKey(id_pw[0])) return "fail";
        else {
            if(!dbMap.get(id_pw[0]).equals(id_pw[1])) return "wrong pw";
            else return "login";
        }

    }
}
