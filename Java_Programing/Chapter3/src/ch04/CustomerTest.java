package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		// 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성할 수 있다.
//		Customer vc = new VIPCustomer(12345, "noname");
		// 하지만 상위클래스의 요소들만 사용이 가능하다.
//		System.out.println(vc.salesRatio);
		
	}
}
