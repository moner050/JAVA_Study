package ch04;

public class StaticTest02 {

    static {
        System.out.println("프로그램 실행 시 가장 먼저 실행되는 코드 영역");
    }

    public static void main(String[] args) {
        System.out.println("main 메소드 실행");
    }
}
