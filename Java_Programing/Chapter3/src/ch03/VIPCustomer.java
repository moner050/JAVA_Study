package ch03;

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
		bonusdRatio = 0.05;
	
		System.out.println("VIPCustomer(int, String) call");
	}

	

	public String getAgentID() {
		
		return agentID;
	}
	
}
