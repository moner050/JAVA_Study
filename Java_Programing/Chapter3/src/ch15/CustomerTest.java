package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		// 업케스팅
		// Buy라는 타입으로 customer를 업캐스팅
		// 상위 클래스 타입으로 묵시적으로 형변환.
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		// Sell이라는 타입으로 customer를 업캐스팅
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
