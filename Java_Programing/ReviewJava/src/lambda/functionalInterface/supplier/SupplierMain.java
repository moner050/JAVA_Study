package lambda.functionalInterface.supplier;

import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<String> myStringSupplier = () -> "hello World";
        System.out.println(myStringSupplier.get());

        // 호출할때마다 Random 한 Double 을 주는 Supplier
//        Supplier<Double> myRandomDoubleSupplier = Math::random;
//        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
//        System.out.println(myRandomDoubleSupplier.get());
//        System.out.println(myRandomDoubleSupplier.get());
//        System.out.println(myRandomDoubleSupplier.get());

        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
        printRandomSupplier(myRandomDoubleSupplier, 5);
    }
    // count 수만큼 랜덤한 Double 을 출력해주는 함수
    public static void printRandomSupplier(Supplier<Double> randomSupplier, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}
