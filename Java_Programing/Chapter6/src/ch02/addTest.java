package ch02;

public class addTest {

	public static void main(String[] args) {

		// 람다식을 인터페이스 자료형 add 변수에 대입.
		Add add = (x, y) -> (x + y);
		
		// 인터페이스 자료형 변수로 함수 호출.
		System.out.println(add.add(2, 3));
	}

}
