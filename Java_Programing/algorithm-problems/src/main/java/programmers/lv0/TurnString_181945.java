package programmers.lv0;

import java.util.Scanner;

// 문자열 돌리기
// https://school.programmers.co.kr/learn/courses/30/lessons/181945
public class TurnString_181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}
