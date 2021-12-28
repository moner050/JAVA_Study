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
		System.out.println("�ֹ� ���� ��ȣ : " + orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNum);
		System.out.println("�ֹ� �� �ּ� : " + address);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuNum);
	}
}
