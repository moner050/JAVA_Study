package ch01;

class Outer2
{
	int outNum = 100;
	static int sNum = 200;
	
	// 클래스를 쓰레드화할때 필요한 Run메서드를 구현화할때 사용하는 인터페이스이다.
	Runnable getRunnable(int i) 
	{	// 메서드의 지역변수나 매개변수는 자동으로 final 선언(상수화)이 된다.
		int num = 10;
		
		// Runnable 인터페이스를 구현한 anonymous Inner 클래스
		return new Runnable()
		{
			int localNum = 1000;
			@Override
			public void run() {
				// 변수를 호출하는것은 가능하나 변수의 값을 변경할수는 없다/
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum);
				System.out.println("Outter.sNum = " + Outer2.sNum);
			}
		};
	}
	Runnable runnable = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable class");
		}
	};
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
	}

}
