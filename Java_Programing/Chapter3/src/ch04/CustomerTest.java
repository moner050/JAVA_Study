package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		// ���� Ŭ������ ������ �����ϰ� ���� Ŭ������ �����ڷ� �ν��Ͻ��� ������ �� �ִ�.
		// ������ ����Ŭ������ ��ҵ鸸 ����� �����ϴ�.
//		System.out.println(vc.salesRatio); ����
		Customer vc = new VIPCustomer(12345, "noname");
		vc.bonusPoint = 10000;
		int priceNo = vc.calcPrice(10000);
		System.out.println(vc.showCustomerInfo() + "���ұݾ��� " + priceNo);
		
	}
}
