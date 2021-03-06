package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10011, "James");
		Customer customerE = new GoldCustomer(10012, "Edward");
		Customer customerP = new GoldCustomer(10013, "Petty");
		Customer customerK = new VIPCustomer(10014, "Tomas");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		/*
		for( Customer customer : customerList )
		{
			System.out.println(customer.showCustomerInfo());
		}
		int price = 10000;
		for( Customer customer : customerList )
		{
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하였습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
		}
		*/
		
		// customerE가 VIPCustomer의 인스턴스인지 확인
		if( customerE instanceof GoldCustomer)
		{
			GoldCustomer vc = (GoldCustomer)customerE;
			System.out.println(customerE.showCustomerInfo());
		}
		
		
	}
}
