package ch04;

public class MethodTest03 {

    public static void main(String[] args) {

        Student kim = new Student();

        double result = kim.printAvg(83, 77);
        System.out.println("두 과목의 평균점수 : " + result);

        result = kim.printAvg(83.2, 77.4);
        System.out.println("두 과목의 평균 점수 : " + result);
    }
}
