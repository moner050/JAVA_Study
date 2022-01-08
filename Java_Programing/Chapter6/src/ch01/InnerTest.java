package ch01;

// 아우터 클래스
class OutClass
{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	// 내부클래스 생성
	public OutClass()
	{
		inClass = new InClass();
	}
	
	// 인스턴스 이너클래스
	private class InClass
	{
		int iNum = 100;
		
		// 인스턴스이너 클래스는 아우터클래스가 먼저 생성되야지 만들어져서 오류가 난다.
		// 인스턴스 이너클래스 내부에서는 정적변수를 사용할 수 없다.
		// 정적변수를 사용하려면 정적 내부 클래스에서 사용해야한다.
		//		static int sInNum = 500; 생성오류
		void inTest()
		{
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			
		}
	}
	
	public void usingClass()
	{	// 내부 클래스 변수를 사용해 메서드를 호출한다.
		inClass.inTest();
	}
	
	// 정적 내부 클래스
	static class InStaticClass
	{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest()
		{
			// 정적 내부 클래스는 외부클래스의 생성과 상관없이 생성될수 있기 때문에 외부클래스의 인스턴스 변수는 사용할 수 없다.
			System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest()
		{
			// static클래스 내부의 static메서드는 내부클래스가 호출되지않아도 사용할수 있어서
			// static클래스 내부의 인스턴스 변수는 사용할 수 없다.
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
	
}


public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
//		outClass.usingClass();
		
		// 인스턴스 이너클래스가 private가 아니면 이런식으로 생성해서 사용할 수 있다.
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		// 아우터클래스 내부의 정적클래스는 바로 생성이 가능하다.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		// 정적 내부 클래스의 정적메서드는 바로 호출이 가능하다.
		OutClass.InStaticClass.sTest();
	}

}
