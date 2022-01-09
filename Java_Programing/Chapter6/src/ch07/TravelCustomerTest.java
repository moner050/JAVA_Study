package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong  = new TravelCustomer("ȫ�浿", 13, 50);
		
		// ArrayList�� ������.
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		// List�� ���� �߰�.
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("�� ��� ���");
		// map�� �̿��Ͽ� �̸��� ����
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("���� ���");
		// ������ price���� �����ͼ� �����ְ� ���
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("20�� �̻� ���̸� ����");
		// customer�� 20�� �̻��̸� �̸��� �����ͼ� ������ ���
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
