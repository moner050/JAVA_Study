package lambda.customFunction;

public class TriFunctionMain {
    public static void main(String[] args) {
        // 매개변수 3개를 받아 값을 리턴해주는 TriFunction 인터페이스를 이용해 3개의 수를 받아 더해주는 람다함수 구현
        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers =
                (Integer x, Integer y, Integer z) ->  x + y + z;

        int result = addThreeNumbers.apply(3, 5, 2);
        System.out.println(result);
    }
}
