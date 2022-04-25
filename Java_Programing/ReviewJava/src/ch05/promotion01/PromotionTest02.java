package ch05.promotion01;

public class PromotionTest02 {
    public static void main(String[] args) {
        // 묵시적 타입 변환

        Human kim = new Human();
        kim = new Student();
        kim = new UniversityStudent();
        kim = new HighStudent();
        // Human 타입의 참조변수로는 age 만 사용 할 수 있다.
        System.out.println(kim.age);

        Student park = new Student();
        park = new UniversityStudent();
        park = new HighStudent();

        // Student 타입의 참조변수로는 age, score 만 사용 할 수 있다.
        System.out.println(park.age);
        System.out.println(park.score);
    }
}
