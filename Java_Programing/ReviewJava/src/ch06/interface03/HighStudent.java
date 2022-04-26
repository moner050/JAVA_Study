package ch06.interface03;

public class HighStudent implements Student {

    String name;
    int score;
    int classNumber;

    HighStudent()
    {

    }

    HighStudent(String name, int score, int classNumber) {
        this.name = name;
        this.score = score;
        this.classNumber = classNumber;
    }

    @Override
    public void takeExam() {
        System.out.println(name + "가 교실에서 시험지를 받는다.");
    }

    @Override
    public void solveExam() {
        System.out.println(name + "가 교실에서 문제를 푼다.");
    }

    @Override
    public void submitExam() {
        System.out.println(name + "가 교실에서 시험지를 제출한다.");
    }

    @Override
    public void calculate() {
        System.out.println("고등학생이 계산을 한다.");
    }
}
