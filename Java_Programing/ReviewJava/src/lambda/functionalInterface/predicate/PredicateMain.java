package lambda.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 하나의 매개변수를 가지고 true/false 를 리턴하는 Predicate 함수 실습
public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(10));

        List<Integer> inputs = Arrays.asList(10, 5, -4, 3, -2, 4, 0);
        // 0 초과인 수들만 List 형태로 리턴
        System.out.println("Positive number : " + filter(inputs, isPositive));
        // 위의 조건과 정 반대인 0 이하인 수들만 List 형태로 리턴
        System.out.println("Non-Positive number : " + filter(inputs, isPositive.negate()));
        // 0과 같거나 0보다 큰 숫자를 List 형태로 리턴
        System.out.println("Non-negative number : " + filter(inputs, isPositive.or(x -> x==0)));
        // 양수중에서 짝수만 골라서 List 형태로 리턴
        System.out.println("Positive even number : " + filter(inputs, isPositive.and(x -> x % 2 == 0)));
    }

    // 제너릭 타입을 받아 List 형태로 리턴해주는 filter 메소드
    public static <T> List<T> filter(List<T> inputs, Predicate<T> condition) {
        // output 을 담을 List 를 생성
        List<T> output = new ArrayList<>();

        // input List 를 받아와서 condition 에 담긴 조건으로 검사 후 true 가 나오면 output 리스트에 담아주고 리턴
        for (T input : inputs) {
            if(condition.test(input)) output.add(input);
        }
        return output;
    }
}
