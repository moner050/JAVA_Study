package ch05.promotion01;

public class CastingTest01 {
    public static void main(String[] args) {

        // 묵시적 타입 형변환
        Student student = new UniversityStudent();

        // 명시적 타입 형변환
        UniversityStudent park = (UniversityStudent) student;
        System.out.println(park.major);

    }
}
