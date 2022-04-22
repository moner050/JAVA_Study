package ch04;

import ch04.constructor.Student;

public class ConstructorTest01 {
    public static void main(String[] args) {
        // Student 객체 생성 및 초기화
        Student kim = new Student();
        kim.name = "김둘리";
        kim.score = 83;
        kim.isPassed = true;
        kim.major = "컴퓨터 공학";
        kim.printInfo();

        Student park = new Student("박또치", 100, true, "식품 영양학");
        park.printInfo();
    }
}