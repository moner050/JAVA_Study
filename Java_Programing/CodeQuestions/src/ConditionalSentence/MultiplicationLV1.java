package ConditionalSentence;

import java.util.Scanner;

public class MultiplicationLV1 {
	/*
	 * # ������ ����[1�ܰ�]
	 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
	 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
	 * ��)	3 x 7 = ?
	 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
	 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
		int fNum = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		int sNum = scan.nextInt();
		
		int mtp = fNum * sNum;
		
		System.out.println(fNum + " X " + sNum + " = ?");
		int answer = scan.nextInt();
		
		if(mtp == answer) {System.out.println("����");}
		else {System.out.println("��");}
	}

}
