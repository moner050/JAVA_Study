package ConditionalSentence;

import java.util.Scanner;

public class LoginLV1 {
	/*
	 * # �α���[1�ܰ�]
	 * 1. Id�� Pw�� �Է¹޴´�.
	 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
	 * ��) �α��� ���� or �α��� ����
	*/

	public static void main(String[] args) {

		int dbId = 1234;
		int dbPw = 1111;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̵� �Է����ּ���(����) : ");
		int ipId = scan.nextInt();
		System.out.print("��й�ȣ�� �Է����ּ���(����) : ");
		int ipPw = scan.nextInt();
		
		if((dbId == ipId) && (dbPw == ipPw))
		{
			System.out.println("�α��� ����");
		}
		else 
		{
			System.out.println("�α��� ����");
		}
		
		scan.close();
	}

}
