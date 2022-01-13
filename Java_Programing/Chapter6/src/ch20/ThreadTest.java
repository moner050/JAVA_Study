package ch20;

class MyThread implements Runnable
{
	@Override
	public void run() {
		int i;
		for(i = 1; i <= 200; i++)
		{
			System.out.print(i + "\t");
		}
	}

}

public class ThreadTest {

	public static void main(String[] args) {
		
		// Thread[main,5,main] Start
		// [�����带 ȣ���� �Լ�, �켱����, �������� �׷�]
		System.out.println(Thread.currentThread()+ " Start");
		
		// runnable��ü�� ���� �� �Ű������� �����ָ� �ȴ�.
		MyThread runnable = new MyThread();

		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + " End");
		
		
		// �����ϰ� ����������� �Ʒ� ��� ���
		Runnable run = new Runnable()
		{
			@Override
			public void run() 
			{
				System.out.println("1");
			}
		};
		run.run();
	}

}
