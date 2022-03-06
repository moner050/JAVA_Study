package ArraySentence;

import java.util.Scanner;

public class CinemaSeats {

/*
 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		int cnt = 0;
		int sales = 0;
		
		boolean run = true;
		
		while(run) 
		{
			for(int i = 0; i < seat.length; i++)
			{
				System.out.print(seat[i] + " ");
			}
			System.out.println("\n= ��ȭ�� =");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) 
			{
				for(int i = 0; i < seat.length; i++)
				{
					System.out.print(seat[i] + " ");
				}
				System.out.print("\n�¼��� �������ּ���[1~7] : ");
				int seatNum = scan.nextInt() - 1;
				
				if(seat[seatNum] == 1) 
				{
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
					continue;
				}
				else
				{
					cnt++;
					seat[seatNum] = 1;
				}
			}
			else if(sel == 2) 
			{
				sales = cnt * 12000;
				run = false;
			}
			System.out.println("����� : " + sales);
		}
		scan.close();
		
		
	}

}
