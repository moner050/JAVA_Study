package ch01;

class Outer2
{
	int outNum = 100;
	static int sNum = 200;
	
	// Ŭ������ ������ȭ�Ҷ� �ʿ��� Run�޼��带 ����ȭ�Ҷ� ����ϴ� �������̽��̴�.
	Runnable getRunnable(int i) 
	{	// �޼����� ���������� �Ű������� �ڵ����� final ����(���ȭ)�� �ȴ�.
		int num = 10;
		
		// Runnable �������̽��� ������ anonymous Inner Ŭ����
		return new Runnable()
		{
			int localNum = 1000;
			@Override
			public void run() {
				// ������ ȣ���ϴ°��� �����ϳ� ������ ���� �����Ҽ��� ����/
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
