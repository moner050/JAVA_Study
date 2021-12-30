package ch19;

public class Car {

	private static int CarNum = 10000;
	public int CarName;
	
	public Car() 
	{
		CarNum++;
		CarName = CarNum;
	}
	public int getCarNum() {
		return CarName;
	}

	public void setCarNum(int carNum) {
		CarNum = carNum;
	}
	
	
}
