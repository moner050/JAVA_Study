package ch06.interface03;

public class UniversityStudent implements Student {

    String name;
    int score;
    String major;

    UniversityStudent()
    {

    }

    UniversityStudent(String name, int score, String major) {
        this.name = name;
        this.score = score;
        this.major = major;
    }

    @Override
    public void takeExam() {
        System.out.println(name + "가 강의장에서 시험지를 받는다.");
    }

    @Override
    public void solveExam() {
        System.out.println(name + "가 강의장에서 문제를 푼다.");
    }

    @Override
    public void submitExam() {
        System.out.println(name + "가 강의장에서 시험지를 제출한다.");
    }

    @Override
    public void calculate() {
        System.out.println("대학생이 계산을 한다.");
    }
}
