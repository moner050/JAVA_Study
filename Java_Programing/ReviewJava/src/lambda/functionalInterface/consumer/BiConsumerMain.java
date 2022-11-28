package lambda.functionalInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

// 매개변수 2개를 받기만 하고 아무것도 리턴하지 않는 BiConsumer 함수 실습해보기
public class BiConsumerMain {

    public static void main(String[] args) {
        BiConsumer<Integer, Double> myDoubleProcessor = (Integer index, Double input) -> {
            System.out.println("Processing " + input + " at index " + index);
        };

        List<Double> inputs = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        process(inputs, myDoubleProcessor);
    }

    // 제너릭 타입을 받는 process 메소드
    public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor) {
        for (int i = 0; i < inputs.size(); i++) {
            processor.accept(i, inputs.get(i));
        }
    }
}
