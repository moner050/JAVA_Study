package lambda.function;

import java.util.function.Function;

public class LambdaFunctionMain {

    public static void main(String[] args) {

        // 람다를 사용하면 따로 클래스를 구현하지 않고 이름이 없는 함수를 선언할 수 있다.
//        Function<Integer, Integer> myAdder = (Integer x) -> {
//            return x + 10;
//        };

        // 매개변수의 타입이 유추 가능할 경우 타입 생략이 가능하다.
        // 매개변수가 하나일 경우 괄호 생략이 가능하다.
        // 바로 값을 리턴하는 경우 중괄호 생략이 가능하다.
        Function<Integer, Integer> myAdder = x -> x + 10;

        int result = myAdder.apply(5);
        System.out.println(result);
    }
}
