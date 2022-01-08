package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		// 매개변수 x와 y를 받고 x가 y보다 크면 x를, 아니면 y를 반환.
		MyNumber myNumber = (x, y) -> x > y ? x : y;
		
		System.out.println(myNumber.getMax(10, 20));
	}
}
