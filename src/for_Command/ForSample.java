package for_Command;

public class ForSample {

	public static void main(String[] args) {
		
		// ������ ���� sum = 0 ����.
		int sum = 0;
		
		// 1~10���� �ݺ�
		for(int i = 1; i<=10; i++)
		{
			// for���� ���������� sum�� i�� �����ش�. 
			sum += i;
			// 1~9 ���
			System.out.print(i);
			
			// i�� 1�̻� 9�����϶� ������ + ���.
			if(i <= 9)
			{
				System.out.print("+");
			}
			else	// i�� 10�̸� 1~10�� ���� ���� ���.
			{
				System.out.print(" = ");
				System.out.print(sum);
			}
		}
	}
}
