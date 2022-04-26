package ch06.polymorphism01;

public class Student {
    String name;
    int score;

    Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    void examTake(){
        System.out.println("시험지를 받는다");
    }

    void examSolve() {
        System.out.println("문제를 푼다.");
    }

    void examSubmit() {
        System.out.println("시험지를 제출한다.");
    }
}
