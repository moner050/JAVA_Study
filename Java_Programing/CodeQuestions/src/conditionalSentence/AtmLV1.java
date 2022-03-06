package conditionalSentence;

import java.util.Scanner;

public class AtmLV1 {
	/*
	 * # ATM[1�ܰ�] : ��ü�ϱ�
	 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
	 * 2. ���¹�ȣ�� ��ġ�ϸ�,
	 * 3. ��ü�� �ݾ��� �Է¹޴´�.
	 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
	 * 			myMoney   - ��ü�� �ݾ�
	 * 			yourMoney + ��ü�� �ݾ�
	 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.print("��ü�� ���¹�ȣ�� �Է����ּ��� : ");
		int ipAcc = scan.nextInt();
		
		if(ipAcc == yourAcc)
		{
			System.out.print("��ü�� �ݾ��� �Է��ϼ��� : ");
			int ipMoney = scan.nextInt();
			
			if(ipMoney > myMoney)
			{
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else
			{
				myMoney = myMoney - ipMoney;
				yourMoney = yourMoney + ipMoney;
				System.out.println("��ü�� �Ϸ�Ǿ����ϴ�.");
			}
		}
		else
		{
			System.out.println("���¹�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
		
		scan.close();
		
	}

}
