package ch02;

// 함수형 인터페이스라는것을 선언.
@FunctionalInterface
public interface Add {
	// 함수형 인터페이스는 메서드를 여러개 선언하면 안된다.
	public int add(int x, int y);
}
