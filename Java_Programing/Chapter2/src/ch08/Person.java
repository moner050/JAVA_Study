package ch08;

public class Person {

	public String Name;
	public int Height;
	public int Weight;
	public int age;
	
	public Person() {}
	
	public Person(String Name,int Height, int Weight, int age)
	{
		this.Name = Name;
		this.Height = Height;
		this.Weight = Weight;
		this.age = age;
	}
	
	public String showPersonInfo()
	{
		return "Ű�� " + Height + " �̰� �����԰� " + Weight + "ų���� ������ �ֽ��ϴ�. �̸��� " + Name + " �̰� ���̴� " + age + "���Դϴ�.";
	}
}
