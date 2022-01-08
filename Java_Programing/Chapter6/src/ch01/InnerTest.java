package ch01;

// �ƿ��� Ŭ����
class OutClass
{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	// ����Ŭ���� ����
	public OutClass()
	{
		inClass = new InClass();
	}
	
	// �ν��Ͻ� �̳�Ŭ����
	private class InClass
	{
		int iNum = 100;
		
		// �ν��Ͻ��̳� Ŭ������ �ƿ���Ŭ������ ���� �����Ǿ��� ��������� ������ ����.
		// �ν��Ͻ� �̳�Ŭ���� ���ο����� ���������� ����� �� ����.
		// ���������� ����Ϸ��� ���� ���� Ŭ�������� ����ؾ��Ѵ�.
		//		static int sInNum = 500; ��������
		void inTest()
		{
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			
		}
	}
	
	public void usingClass()
	{	// ���� Ŭ���� ������ ����� �޼��带 ȣ���Ѵ�.
		inClass.inTest();
	}
	
	// ���� ���� Ŭ����
	static class InStaticClass
	{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest()
		{
			// ���� ���� Ŭ������ �ܺ�Ŭ������ ������ ������� �����ɼ� �ֱ� ������ �ܺ�Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			System.out.println("InClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		
		static void sTest()
		{
			// staticŬ���� ������ static�޼���� ����Ŭ������ ȣ������ʾƵ� ����Ҽ� �־
			// staticŬ���� ������ �ν��Ͻ� ������ ����� �� ����.
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
	}
	
}


public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
//		outClass.usingClass();
		
		// �ν��Ͻ� �̳�Ŭ������ private�� �ƴϸ� �̷������� �����ؼ� ����� �� �ִ�.
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		// �ƿ���Ŭ���� ������ ����Ŭ������ �ٷ� ������ �����ϴ�.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		// ���� ���� Ŭ������ �����޼���� �ٷ� ȣ���� �����ϴ�.
		OutClass.InStaticClass.sTest();
	}

}
