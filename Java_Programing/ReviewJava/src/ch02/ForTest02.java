package ch02;

public class ForTest02 {

    public static void main(String[] args) {

        // 구구단 출력
        for (int dan = 2; dan <= 9; dan++)
        {
            System.out.println("== " + dan + " 단 ==");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
        }
    }
}
