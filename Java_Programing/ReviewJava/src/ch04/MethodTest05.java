package ch04;

import ch04.orderPackage.Student;

public class MethodTest05 {

    public static void main(String[] args) {
        Student kim = new Student();
        kim.firstScore = 99;
        kim.secondScore = 33;

		System.out.println("before(kim.firstScore) : " + kim.firstScore);
		System.out.println("before(kim.secondScore) : " + kim.secondScore);

    swapValue(kim);

		System.out.println("after(kim.firstScore) : " + kim.firstScore);
		System.out.println("after(kim.secondScore) : " + kim.secondScore);
}

    private static void swapValue(Student std) {
        int temp = std.firstScore;
        std.firstScore = std.secondScore;
        std.secondScore = temp;
        System.out.println("swapValue()에서 firstScore : " + std.firstScore);
        System.out.println("swapValue()에서 secondScore : " + std.secondScore);
    }
}
