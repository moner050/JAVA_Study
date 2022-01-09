package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong  = new TravelCustomer("홍길동", 13, 50);
		
		// ArrayList로 고객관리.
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		// List에 고객들 추가.
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("고객 명단 출력");
		// map을 이용하여 이름만 추츨
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("여행 비용");
		// 고객들의 price값만 가져와서 더해주고 출력
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("20세 이상 고객이름 정렬");
		// customer가 20살 이상이면 이름을 가져와서 정렬후 출력
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
