package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		// 추상클래스는 인스턴스화 할 수 없다.
		// Computer computer = new Computer();
		
		Computer desktop = new Desktop();

		desktop.display();
		
	}

}
