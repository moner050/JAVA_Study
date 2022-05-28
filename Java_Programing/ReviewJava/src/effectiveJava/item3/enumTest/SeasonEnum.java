package effectiveJava.item3.enumTest;

public class SeasonEnum {
    public static void main(String[] args) {

        // 열거 타입으로 변수 선언 후, 열거 상수 값 할당해주기.
        // 열거 상수는 단독으로 사용 할 수 없어, 앞에 열거타입이 붙어야 한다.
        Season season2022 = Season.SPRING;
        System.out.println(season2022);

        // 그리고 열거 타입 변수도 참조 타입이기 때문에, null 값을 저장 할 수 있다.
        season2022 = null;
        // 이렇게 출력하보면 null 이 출력된다.
        System.out.println(season2022);
    }
}
