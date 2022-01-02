package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar()
	{
		System.out.println("시동을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("시동을 끕니다.");
	}
	
	// 구현되지않은 메서드
	public void washCar() {}
	
	// 재정의를 못하게 final 선언
	final public void run()
	{
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
