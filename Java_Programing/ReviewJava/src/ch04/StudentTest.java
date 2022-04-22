package ch04;

public class StudentTest {

    public static void main(String[] args) {
        // Student 객체 생성 및 초기화화
       Student kim = new Student();

        kim.name = "둘리";
        kim.score = 99;

        // Student 객체의 변수 사용
        kim.printInfo();
    }
}
