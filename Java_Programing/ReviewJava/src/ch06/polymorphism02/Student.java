package ch06.polymorphism02;

// 추상 클래스 선언
public abstract class Student {
    String name;
    int score;

    Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    // 추상메소드 선언
    abstract void examTake();

    abstract void examSolve();

    abstract void examSubmit();
}
