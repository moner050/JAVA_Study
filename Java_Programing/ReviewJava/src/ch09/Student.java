package ch09;

public class Student {
    private String studentNo;
    private String name;
    private int score;
    private String major;

    public Student(String studentNo, String name, int score, String major)
    {
        super();
        this.studentNo = studentNo;
        this.name = name;
        this.score = score;
        this.major = major;
    }

    public String getStudentNo() {
        return studentNo;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student [studentNo=" + studentNo + ", name=" + name + ", score="
                + score + ", major=" + major + "]";
    }
}
