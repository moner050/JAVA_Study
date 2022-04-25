package ch05.inheritance02;

public class InheritanceTest {
    public static void main(String[] args) {

        UniversityStudent kim = new UniversityStudent();
        kim.name = "고길동";
        kim.score = "88점";
        kim.major = "컴퓨터공학";

        kim.printInfo();

        UniversityStudent lee = new UniversityStudent();
        lee.name = "이순신";
        lee.score = "55점";
        lee.major = "군사학과";

        lee.printInfo(3);
    }
}
