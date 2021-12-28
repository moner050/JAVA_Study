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
		return "키가 " + Height + " 이고 몸무게가 " + Weight + "킬로인 남성이 있습니다. 이름은 " + Name + " 이고 나이는 " + age + "세입니다.";
	}
}
