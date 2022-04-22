package ch04;

import ch04.staticTest.Student;

public class StaticTest01 {
    public static void main(String[] args) {

        System.out.println(Student.schoolName + " 학생들의 시험 결과");
        Student kim = new Student("김유신", 83);
        kim.printInfo();

        System.out.println(Student.schoolName + " 학생들의 시험 결과");
        Student park = new Student("박종우", 55);
        park.printInfo();

        System.out.println(Student.schoolName + " 학생들의 시험 결과");
        Student lee = new Student("이순신", 97);
        lee.printInfo();


        System.out.println("전체 생성된 Student 객체의 수 : " +
                Student.studentCount);
    }
}
