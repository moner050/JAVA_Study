package ch04.constructor;

public class Student {
    public String name;
    public int score;
    public boolean isPassed;
    public String major;

    public Student() {
    }

    public Student(String stdName, int stdScore, boolean stdIsPassed,
                   String stdMajor) {
        name = stdName;
        score = stdScore;
        isPassed = stdIsPassed;
        major = stdMajor;
    }

    public void printInfo() {
        System.out.println(name + "의 전공 : " + major + ", 점수 : " + score +
                "(시험 통과 여부 : " + isPassed + ")");
    }
}
