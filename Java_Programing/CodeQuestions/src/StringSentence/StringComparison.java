package StringSentence;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args){
		
		/*
		 * # ���ڿ� ��
		 * . equals() �޼��� ������ ������ ��ġ���� ��
		 * ��)
		 * �ڳ���
		 * �Է� = Ƽ�����罺
		 * ��� = false
		 */
		Scanner scan = new Scanner(System.in);
		int chk = 0;
		String name = "�ڳ���";
		
		System.out.print("���� �̸��� �Է��ϼ��� : ");			// ex) Ƽ�����罺
		String myName = scan.next();

		if(name.length() == myName.length())
		{
			chk = 1;
			for(int i = 0; i < name.length(); i++)
			{
				if(name.charAt(i) == myName.charAt(i)) chk = 1;
				else chk = 0;
			}
		}

		if(chk == 0) System.out.println("��� = false");
		else System.out.println("��� = true");
		scan.close();
	}
}
