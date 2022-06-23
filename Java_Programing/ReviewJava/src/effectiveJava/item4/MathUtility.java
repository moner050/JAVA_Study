package effectiveJava.item4;

public class MathUtility {

    // 인스턴스화가 필요하지 않은 정적 변수
    private static double PI = 3.14159265358979323846;

    // 만약 생성자를 만들지않으면 컴파일러가 기본 생성자를 생성해준다!

    // 원의 둘레를 구하는 정적 메서드
    public static double getCircumference(double radius){
        return (2 * PI * radius);
    }
}
