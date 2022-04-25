package ch05.inheritance02;

// Student 메소드 오버라이딩 테스트
public class UniversityStudent extends Student {
    String score;
    String major;

    public void printInfo() {
        System.out.println(name + "(" + major + ")의 점수 : " + score);
    }

    public void printInfo(int grade) {
        System.out.println(name + "(" + grade + "학년)의 점수 : " + score);
    }
}
