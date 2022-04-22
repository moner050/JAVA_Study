package ch04;

public class ObjectTest02 {
    public static void main(String[] args) {

        // 이름이 같은 여러 패키지 사용해보기
        Student lee = new Student();
        ch04.packageTest.Student kim = new ch04.packageTest.Student();

        lee.name = "이모씨";
        lee.score = 88;
        kim.name = "김모씨";
        kim.score = 25;

        System.out.println(lee.printInfo());
        System.out.println(kim.printInfo());
    }
}
