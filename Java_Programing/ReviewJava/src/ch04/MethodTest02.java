package ch04;

public class MethodTest02 {

    public static void main(String[] args) {
        Student kim = new Student();
        int sum = kim.forTest();
        System.out.println("1 ~ 100까지의 합 : " + sum);

        String studentInfo = kim.printInfo();
        System.out.println(studentInfo);

        double avgScore = kim.printAvg(83, 77, 79);
        System.out.println(kim.name + "의 세 과목 평균 점수 : " + avgScore);
    }
}
