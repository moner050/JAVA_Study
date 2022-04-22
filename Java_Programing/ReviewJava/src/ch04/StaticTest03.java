package ch04;

import ch04.staticTest.Student;

public class StaticTest03 {

    public static void main(String[] args) {
        Student kim = Student.studentInstance;
        System.out.println(kim.toString());
        kim.printInfo();

        Student park = Student.studentInstance;
        System.out.println(park.toString());
        park.printInfo();

        Student choi = Student.studentInstance;
        System.out.println(choi.toString());
        choi.printInfo();
    }
}
