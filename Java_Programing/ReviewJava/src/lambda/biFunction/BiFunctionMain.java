package lambda.biFunction;

import java.util.function.BiFunction;

public class BiFunctionMain {
    public static void main(String[] args) {
        // BiFunction<인풋타입, 인풋타입, 리턴타입>
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        int result = add.apply(3, 8);
        System.out.println(result);
    }
}
