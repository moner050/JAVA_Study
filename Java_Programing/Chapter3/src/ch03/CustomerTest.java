package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// ���� Ŭ������ ������ �����ϰ� ���� Ŭ������ �����ڷ� �ν��Ͻ��� ������ �� �ִ�.
		Customer vc = new VIPCustomer(12345, "noname");
		// ������ ����Ŭ������ ��ҵ鸸 ����� �����ϴ�.
//		System.out.println(vc.salesRatio);
		
	}
}
