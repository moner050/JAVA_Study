package classSentence;

import java.util.Scanner;

class Ex05{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}
public class ClassSentence3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex05 namkang = new Ex05();
		namkang.name = "���� ����б�";
		
		while(true) 
		{
			// �޴� ���
			System.out.println("=== " + namkang.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			
			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			// ������ ����Ȯ��
			if(choice == 1) 
			{
				int total = 0;
				for(int i=0; i<namkang.arScore.length; i++) 
				{
					total += namkang.arScore[i];
				}
				double avg = (double)total / namkang.arScore.length;
				System.out.println("������ �� = " + namkang.arScore.length + "��");
				System.out.println("���� = " + total + "��");
				System.out.printf("��� = %.1f��\n", avg);
			}
			// 1���л� Ȯ���ϱ�
			else if(choice == 2) 
			{
				int maxScore = namkang.arScore[0];
				int maxIdx = 0;
				for(int i=1; i<namkang.arScore.length; i++) 
				{
					if(maxScore < namkang.arScore[i]) 
					{
						maxScore = namkang.arScore[i];
						maxIdx = i;
					}
				}
				System.out.println("=== 1�� ===");
				System.out.println("�й� : " + namkang.arHakbun[maxIdx]);
				System.out.println("���� : " + maxScore);
			}
			// �õ��л� Ȯ���ϱ�
			else if(choice == 3) 
			{
				int minScore = namkang.arScore[0];
				int minIdx = 0;
				for(int i=1; i<namkang.arScore.length; i++) 
				{
					if(minScore > namkang.arScore[i]) 
					{
						minScore = namkang.arScore[i];
						minIdx = i;
					}
				}
				System.out.println("=== �õ� ===");
				System.out.println("�й� : " + namkang.arHakbun[minIdx]);
				System.out.println("���� : " + minScore);
			}
			// ���� Ȯ���ϱ�
			else if(choice == 4) 
			{
				System.out.print("�й��� �Է��ϼ��� : ");
				int hakbun = scan.nextInt();
				
				// �й� ��ȿ�� �˻�
				int check = -1;
				for(int i=0; i<namkang.arHakbun.length; i++) 
				{
					if(namkang.arHakbun[i] == hakbun) check = i;
				}
				
				if(check == -1) System.out.println("�й��� �߸� �Է��Ͽ����ϴ�.");
				else 
				{
					System.out.println(hakbun + 
							"�й� �л��� ������ " + namkang.arScore[check] + 
							"�� �Դϴ�.");
				}
			}
			// �����ϱ�
			else if(choice == 5) 
			{
				System.out.println("���α׷� ����");
				break;
			}
		}
		
	}

}
