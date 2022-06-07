package effectiveJava.item1.returnLow;

public class MainReturnLow {
    public static void main(String[] args) {
        // 매개변수 한강을 넣어주면 하위타입 객체를 반환시켜 준다.
        School hangang = School.introduceSchool("한강");
        // 학교 소개 출력.
        hangang.print();
    }
}
