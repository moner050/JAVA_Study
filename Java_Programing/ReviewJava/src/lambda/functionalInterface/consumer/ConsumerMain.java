package lambda.functionalInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// 매개변수를 받기만 하고 아무것도 리턴하지 않는 Consumer 함수 실습해보기
public class ConsumerMain {

    public static void main(String[] args) {
        Consumer<String> myStringConsumer = (String str) -> System.out.println(str);
//        Consumer<String> myStringConsumer = System.out::println;
        myStringConsumer.accept("hello");
        myStringConsumer.accept("world");

        // Arrays.asList 를 쓰면 바로 해당 아이템들이 담긴 List 를 생성해준다.
        // 하지만 이렇게 만든 List 는 변형을 할 수 없어서 add 를 하면 에러가 발생한다.(UnsupportedOperationException)
        List<Integer> integerInputs = Arrays.asList(4, 2, 3);
        Consumer<Integer> myIntegerProcessor = x -> System.out.println("Processing integer : " + x);
        Consumer<Integer> myDifferentIntegerProcessor = x -> System.out.println("Processing integer in different way : " + x);

        process(integerInputs, myIntegerProcessor);
        process(integerInputs, myDifferentIntegerProcessor);

        List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        Consumer<Double> myDoubleProcessor = x -> System.out.println("Processing double : " + x);

        process(doubleInputs, myDoubleProcessor);
    }

    // 제너릭 타입을 받는 process 메소드
    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            processor.accept(input);
        }
    }
}
