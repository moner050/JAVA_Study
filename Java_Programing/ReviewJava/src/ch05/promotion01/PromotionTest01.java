package ch05.promotion01;

public class PromotionTest01 {
    public static void main(String[] args) {
        // 실제 참조변수를 통해 실제 사용할 수 있는 맴버변수는
        // 참조변수가 선언된 클래스에 속한 변수만 사용할 수 있다.
        UniversityStudent kim = new UniversityStudent();
        System.out.println("전공 : " + kim.major);
        System.out.println("점수 : " + kim.score);
    }

}
