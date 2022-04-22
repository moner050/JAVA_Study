package ch04.staticTest;

public class Student {
    public static String schoolName = "스태틱 대학교";
    public static int studentCount;
    String name;
    int score;

    public static Student studentInstance;

    static {
        if(studentInstance == null) {
            studentInstance = new Student("고길동", 100);
        }
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        studentCount++;
    }

    public void printInfo() {
        System.out.println(name + " (" + schoolName + ")의 점수 : " + score);
    }
}
