package ch05.inheritance03;

// Student 메소드 오버라이딩 테스트
public class UniversityStudent extends Student {
    int score;

    UniversityStudent() {
        System.out.println("===> UniversityStudent() 생성자 호출");
    }

    UniversityStudent(String name, int score) {
        super(name);
        this.score = score;
        System.out.println("===> UniversityStudent(String name, int score) 생성자 호출");
    }

    String printInfo() {
        return super.printInfo() + ", 점수 : " + score;
    }
}
