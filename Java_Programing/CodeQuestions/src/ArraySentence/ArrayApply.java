package ArraySentence;

import java.util.Scanner;

public class ArrayApply {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a[] = { 10, 49, 51, 36, 17 };
		int idx = 0;
		// ���� 1) ���� ����Ʈ�� ���� �Է��ϸ�   ��ȣ ��� 
		// ��) 51 ==> 2
		// ��) 10 ==> 0
		System.out.print("����Ʈ�� ���� �Է��ϼ��� : ");
		int ipList = scan.nextInt();
		
		for(int i = 0; i < a.length; i++)
		{
			if(ipList == a[i]) {idx = i;}
		}
		System.out.println("��ȣ : " + idx + "��");

		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 != 0) {b[i] = a[i];}
			System.out.print(b[i] + " ");
		}

		System.out.println();
		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 2�������� ���� �ٸ�
		// ��) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int cnt = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 != 0) 
			{
				c[cnt] = a[i];
				cnt++;
			}
		}
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		idx = 0;
		System.out.print("\n�й��� �Է����ּ��� : ");
		int ipSNum = scan.nextInt();

		for(int i = 0; i < arr.length; i += 2)
		{
			if(ipSNum == arr[i]) {idx = i;}
		}
		System.out.print("���� : " + arr[idx+1]);
		
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002
		idx = 0;
		System.out.print("\n������ �Է����ּ��� : ");
		int ipScore = scan.nextInt();

		for(int i = 1; i < arr.length; i += 2)
		{
			if(ipScore == arr[i]) {idx = i;}
		}
		System.out.print("�й� : " + arr[idx-1]);
		
		scan.close();
	}

}
