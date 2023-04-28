package programmers.lv0;

import java.util.Scanner;

// 대소문자 바꿔서 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181949
public class PrintStrLowerUpper_181949 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char c : a.toCharArray()) {
            if(c >= 'a' && c <= 'z') sb.append((char)(c - 32));
            else if (c >= 'A' && c <= 'Z') sb.append((char)(c + 32));
        }

        System.out.println(sb);
    }
}
