package RepeatedStatement;

public class Novicefor {

	public static void main(String[] args) {
		// ����1) 1~10���� �ݺ��� 5~9 ���
		// ����1) 5, 6, 7, 8, 9
		for(int i = 1; i < 10; i++)
		{
			if(i > 4 && i < 9) {System.out.print(i + ", ");}
			else if(i > 8) {System.out.println(i);}
		}
		
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		// ����2) 6, 5, 4, 3
		for(int i = 10; i > 1; i--)
		{
			if(i < 7 && i >= 4) {System.out.print(i + ", ");}
			else if(i == 3) {System.out.println(i);}
		}
		
		
		// ����3) 1~10���� �ݺ��� ¦���� ���
		// ����3) 2, 4, 6, 8, 10
		int i = 1;
		
		while(i <= 10)
		{
			if(i % 2 == 0 && i < 10) {System.out.print(i + ", ");}
			else if(i == 10) {System.out.println(i);}
			
			i++;
		}
		
	}

}
