package ch07;

public class TravelCustomer {
	
	// 이름, 나이, 가격
	private String name;
	private int age;
	private int price;

	// 생성자
	public TravelCustomer(String name, int age, int price)
	{
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name : " + name + " age : " + age + " price : " + price;
	}
	
	
}
