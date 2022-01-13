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
		// [쓰레드를 호출한 함수, 우선순위, 쓰레드의 그룹]
		System.out.println(Thread.currentThread()+ " Start");
		
		// runnable객체를 생성 후 매개변수로 끼워주면 된다.
		MyThread runnable = new MyThread();

		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + " End");
		
		
		// 간단하게 돌리고싶으면 아래 방법 사용
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
