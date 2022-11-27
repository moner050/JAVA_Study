package lambda.customFunction;

// 단 하나의 abstract method 만을 가지는 인터페이스
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    // 매개변수 3개를 받아 값을 리턴해주는 TriFunction 인터페이스
    R apply(T t, U u, V v);
}
