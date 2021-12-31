package ch02;

public class VIPCustomer extends Customer{

	// Customer 을 상속받았기 때문에 Customer 내의 private 접근제어 지시자 빼고는 사용 가능하다.
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer()
	{
//		컴파일러가 자동으로 상위클래스 생성자를 호출해준다.
//		super();
		bonusdRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentID() {
		return agentID;
	}
	
}
