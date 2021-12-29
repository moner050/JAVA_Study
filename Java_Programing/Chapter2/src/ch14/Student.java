package ch14;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName, int money) 
	{
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus)
	{
		// 버스를 탔을때 천원지불
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway)
	{
		// 지하철을 탔을때 1200원 지불
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo()
	{
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
