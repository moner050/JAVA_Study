package ch15;

public class Person {

	String personName;
	int money;
	
	public Person(String personName, int money)
	{
		this.personName = personName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi, int money)
	{
		taxi.take(money);
		this.money -= money;
	}
	
	public void showInfo()
	{
		System.out.println(personName + "님의 남은 돈은 " + money +"원 입니다");
	}
}
