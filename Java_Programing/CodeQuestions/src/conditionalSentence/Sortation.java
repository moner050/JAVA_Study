package conditionalSentence;

public class Sortation {

	public static void main(String[] args) {


		// ���� 1) ���, 0, ���� ���
		int num1 = 10;
		
		if(num1 > 0) {System.out.println("���");}
		else if(num1 == 0) {System.out.println("0");}
		else {System.out.println("����");}
		
		// ���� 2) 4�� ��� ���
		int num2 = 6;
		if(num2 % 4 == 0) {System.out.println("4�� ����Դϴ�.");}
		else {System.out.println("4�� ����� �ƴմϴ�.");}
				
		// ���� 3) �հ�, ���հ� ���
		int score = 70;
		if(score > 70) {System.out.println("�հ�");}
		else if(score <= 70) {System.out.println("���հ�");}
		
	}

}
