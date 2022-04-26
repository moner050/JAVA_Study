package ch06.interface02;

public class InterfaceTest02 {
    public static void main(String[] args) {

        Student lee = new HighStudent("이급식", 20, 3);
        Student kim = new UniversityStudent("김학식", 88, "불교학과");

        lee.takeExam();
        lee.solveExam();
        lee.submitExam();

        kim.takeExam();
        kim.solveExam();
        kim.submitExam();
    }
}
