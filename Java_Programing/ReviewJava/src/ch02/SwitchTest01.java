package ch02;

public class SwitchTest01 {
    public static void main(String[] args) {
        char grade = 'C';

        switch(grade)
        {
            case 'A':
                System.out.println("A 등급은 90~100 사이의 점수입니다.");
                break;
            case 'B':
                System.out.println("B 등급은 80~89 사이의 점수입니다.");
                break;
            case 'C':
                System.out.println("C 등급은 70~79 사이의 점수입니다.");
                break;
            case 'D':
                System.out.println("D 등급은 60~69 사이의 점수입니다.");
                break;
            default:
                System.out.println("존재하지 않는 등급입니다.");
                break;
        }
    }
}
