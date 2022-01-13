package ch19;

public class Latte extends Decorator{

	// ����Ŭ������ default constructor�� ��� �Ű������� �ִ� super�� ȣ���ؾ��Ѵ�.
	public Latte(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}

	
}
