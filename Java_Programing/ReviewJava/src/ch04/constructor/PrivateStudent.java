package ch04.constructor;

public class PrivateStudent {
    private String name;
    private int score;
    private boolean isPassed;
    private String major;

    public PrivateStudent() {
    }
    public PrivateStudent(String stdName, int stdScore)
    {
        name = stdName;
        score = stdScore;
    }

    public PrivateStudent(String name, int score, boolean stdIsPassed,
                          String stdMajor) {
        this(name, score);
        this.isPassed = stdIsPassed;
        this.major = stdMajor;
    }

    public void printInfo() {
        System.out.println(name + "의 전공 : " + major + ", 점수 : " + score +
                "(시험 통과 여부 : " + isPassed + ")");
    }
}
