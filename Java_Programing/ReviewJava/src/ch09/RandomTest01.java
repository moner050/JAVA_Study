package ch09;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        // 랜덤박스 학생점수 만들어보기
        Random random = new Random();

        System.out.println("[ 학생들의 시험 유형 ]");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번 학생의 시험 유형 : ");

            int examType = random.nextInt(5) + 1;
            switch (examType)
            {
                case 1 :
                    System.out.println("A");
                    break;
                case 2 :
                    System.out.println("B");
                    break;
                case 3 :
                    System.out.println("C");
                    break;
                case 4 :
                    System.out.println("D");
                    break;
                case 5 :
                    System.out.println("E");
            }
        }
    }
}
