package ch02;

public class VIPCustomer extends Customer{

	// Customer �� ��ӹ޾ұ� ������ Customer ���� private �������� ������ ����� ��� �����ϴ�.
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer()
	{
//		�����Ϸ��� �ڵ����� ����Ŭ���� �����ڸ� ȣ�����ش�.
//		super();
		bonusdRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentID() {
		return agentID;
	}
	
}
