package ch08;

import java.util.Objects;

public class Student {

    private String name;
    private int score;

    Student(String name, int score)
    {
        System.out.println("===> Student(String name, int score) 생성자 호출");
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        Student other = (Student) o;
        return name.equals(other.name) && score == other.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "학생의 이름(name)은 " + name + ", 점수(score)는 " + score + "점";
    }
}
