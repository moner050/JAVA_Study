package conditionalSentence;

import java.util.Scanner;

public class ReceiptLV1 {

	/*
	 * # ������ ���[1�ܰ�]
	 * 1. �޴����� ����Ѵ�.
	 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
	 * 3. ������ �Է¹޴´�.
	 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
	 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		String menuName = "";
		int menuPrice = 0;
		int change = 0;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		System.out.print("�ֹ��� �޴��� ��ȣ�� �Է����ּ��� : ");
		int menuNum = scan.nextInt();
		
		if(menuNum == 1) 
		{
			menuPrice = price1;
			menuName = "�Ұ�� ����";
		}
		else if(menuNum == 2) 
		{
			menuPrice = price2;
			menuName = "���� ����";
		}
		else if(menuNum == 3) 
		{
			menuPrice = price3;
			menuName = "�ݶ�";
		}
		
		System.out.print("������ �Է����ּ��� : ");
		int money = scan.nextInt();
		
		if(money > menuPrice)
		{
			change = money - menuPrice;
			System.out.println("\n������ : " + money + "��");
			System.out.println("������ �޴� : " + menuName);
			System.out.println("�Ž����� : " + change + "��");
		}
		else
		{
			System.out.println("������ �����մϴ�.");
		}
		
		
		scan.close();
		
	}
}
