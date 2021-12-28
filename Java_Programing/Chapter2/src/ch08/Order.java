package ch08;

public class Order {

	public long orderNum;
	public String phoneNum;
	public String address;
	public int orderDate;
	public int orderTime;
	public int price;
	public String menuNum;
	
	public Order() {}
	
	public Order(long orderNum, String phoneNum, String address, int orderDate, int orderTime, int price, String menuNum)
	{
		this.address = address;
		this.phoneNum = phoneNum;
		this.menuNum = menuNum;
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.price = price;
	}
	
	public void showOrderInfo()
	{
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNum);
	}
}
