package ch06.polymorphism02;

public class UniversityStudent extends Student {

    UniversityStudent(String name, int score) {
        super(name, score);
    }

    // 메소드 오버라이딩
    @Override
    void examTake() {
        System.out.println(name + "(이)가 강의장에서 시험지를 받는다.");
    }

    @Override
    void examSolve() {
        System.out.println(name + "(이)가 강의장에서 문제를 푼다.");
    }

    @Override
    void examSubmit() {
        System.out.println(name + "(이)가 강의장에서 시험지를 제출한다.");
    }
}
