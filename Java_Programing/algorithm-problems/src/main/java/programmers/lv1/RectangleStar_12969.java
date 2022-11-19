package programmers.lv1;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12969
public class RectangleStar_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }
    }
}
