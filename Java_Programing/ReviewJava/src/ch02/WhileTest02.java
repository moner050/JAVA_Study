package ch02;

public class WhileTest02 {

    public static void main(String[] args) {
        // 구구단 출력
        int dan = 2;
        while (dan <= 9)
        {

            System.out.println("== " + dan + " 단 ==");
            int i = 1;
            while (i <= 9)
            {
                System.out.println(dan + " X " + i + " = " + (dan * i));
                i++;
            }

            dan++;
            System.out.println("==========");
        }
    }

}
