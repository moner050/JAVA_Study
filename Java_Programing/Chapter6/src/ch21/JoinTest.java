package ch21;

public class JoinTest extends Thread{

	int start;
	int end;
	// �ɹ��������� �ʱ�ȭ���� �ʾƵ� �⺻������ 0���� �ʱ�ȭ�ȴ�.
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
		
		// 1���� 100���� �����带 �̿��� ���� ���� ����غ���
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);

		jt1.start();
		jt2.start();
		
		// join()�� �ɸ� main�� jt1�� jt2�� ������ ���������� ��ٸ���.
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
