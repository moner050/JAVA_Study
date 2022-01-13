package ch21;

import java.io.IOException;

public class TerminateThread extends Thread{

	private boolean flag = false;
	int i;
	
	// 쓰레드의 이름을 받아 저장.
	public TerminateThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		while(!flag)
		{
			try
			{
				sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println(getName() + " end");
	}
	
	// Flag의 boolean값 변경
	public void setFlag(boolean flag)
	{
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {

		// 쓰레드의 이름을 지정.
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		// 쓰레드 시작
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		
		while(true)
		{
			in = System.in.read();
			if( in == 'A')
			{
				threadA.setFlag(true);
			}
			else if( in == 'B')
			{
				threadB.setFlag(true);
			}
			else if( in == 'C')
			{
				threadC.setFlag(true);
			}
			else if( in == 'M')
			{
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
		}
		System.out.println("main end");
	}

}
