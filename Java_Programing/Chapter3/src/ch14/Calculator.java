package ch14;

public abstract class Calculator implements Calc{

	// 전부 구현하지 않을려면 abstract 클래스를 해줘야 함.
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
