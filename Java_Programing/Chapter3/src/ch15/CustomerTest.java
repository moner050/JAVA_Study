package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		// ���ɽ���
		// Buy��� Ÿ������ customer�� ��ĳ����
		// ���� Ŭ���� Ÿ������ ���������� ����ȯ.
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		// Sell�̶�� Ÿ������ customer�� ��ĳ����
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
