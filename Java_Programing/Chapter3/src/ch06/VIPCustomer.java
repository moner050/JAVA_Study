package ch06;

public class VIPCustomer extends Customer{

	// Customer �� ��ӹ޾ұ� ������ Customer ���� private �������� ������ ����� ��� �����ϴ�.
	double salesRatio;
	private String agentID;
	
	/*
	public VIPCustomer()
	{
//		�����Ϸ��� �ڵ����� ����Ŭ���� �����ڸ� ȣ�����ش�.
//		super();
		bonusdRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer() call");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) 
	{
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	// �������̵�� �޼���� �̸��� ���ƾ� �Ѵ�.
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}



	public String getAgentID() {
		
		return agentID;
	}
	
}
