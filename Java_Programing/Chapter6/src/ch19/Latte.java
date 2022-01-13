package ch19;

public class Latte extends Decorator{

	// 상위클래스에 default constructor가 없어서 매개변수가 있는 super를 호출해야한다.
	public Latte(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}

	
}
