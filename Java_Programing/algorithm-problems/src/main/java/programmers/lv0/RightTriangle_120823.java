package programmers.lv0;

import java.util.Scanner;

// 직각 삼각형 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120823
public class RightTriangle_120823 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(i));
            if(i != n) sb.append("\n");
        }
        System.out.println(sb.toString());
    }

}
