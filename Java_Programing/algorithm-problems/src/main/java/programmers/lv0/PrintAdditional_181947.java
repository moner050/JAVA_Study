package programmers.lv0;

import java.util.Scanner;

// 덧셈식 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181947
public class PrintAdditional_181947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d",a, b, a+b);
    }
}
