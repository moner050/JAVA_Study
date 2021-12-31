package ch03;

public class Customer {

	// protected는 하위클래스에서는 접근이 가능하다. 외부클래스에서는 접근이 불가능하다.
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusdRatio;
	
	// 생성자 생성
	/*public Customer()
	{
		customerGrade = "SILVER";
		bonusdRatio = 0.01;
		
		System.out.println("Customer() call");
	}
	*/
	
	public Customer(int customerID, String customerName)
	{
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		System.out.println("Customer(int, String) call");
	}
	
	
	public int calcPrice(int price)
	{
		// 매개변수를 받아 보너스포인트에 적립.
		bonusPoint += price * bonusdRatio;
		return price;
	}
	
	public String showCustomerInfo()
	{
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
