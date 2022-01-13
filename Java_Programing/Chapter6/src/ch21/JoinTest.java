package ch21;

public class JoinTest extends Thread{

	int start;
	int end;
	// 맴버변수여서 초기화하지 않아도 기본값으로 0으로 초기화된다.
	int total;
	
	public JoinTest(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	
	public void run()
	{
		int i;
		for(i = start; i <= end; i++)
		{
			total += i;
		}
	}
	
	public static void main(String[] args) {
		
		// 1부터 100까지 쓰레드를 이용해 더한 값을 출력해보기
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);

		jt1.start();
		jt2.start();
		
		// join()을 걸면 main이 jt1과 jt2의 연산이 끝날때까지 기다린다.
		try 
		{
			jt1.join();
			jt2.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		System.out.println("lastTotal = " + lastTotal);
	}

}
