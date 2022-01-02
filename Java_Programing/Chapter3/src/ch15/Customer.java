package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
	}

	// default 메소드가 중복되면 구현하는 클래스에서 재정의해야함
	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void hello()
	{
		System.out.println("hello");
	}
}
