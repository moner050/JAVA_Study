package ch15;

public class Taxi {

	String companyName;
	int money;
	
	public Taxi(String compayName)
	{
		this.companyName = compayName;
	}
	
	public void take(int money)
	{
		this.money += money;
	}
	
	public void showTaxiInfo()
	{
		System.out.println(companyName + "�ý� ������ " + money + "�� �Դϴ�.");
	}
}
