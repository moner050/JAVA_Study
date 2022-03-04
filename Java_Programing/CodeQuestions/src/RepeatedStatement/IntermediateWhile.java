package RepeatedStatement;

public class IntermediateWhile {

	public static void main(String[] args) {

		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		int i = 0;
		while(i <= 300)
		{
			if(i % 9 == 0 && i % 10 == 6)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		i = 0;
		while(i <= 300)
		{
			if(i % 9 == 0 && i / 10 == 6)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
		i = 300;
		while(i >= 0)
		{
			if(i % 8 == 0 && i < 150)
			{
				System.out.println(i);
				break;
			}
			i--;
		}
		
		//����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ���  # �� : 6 (54,63,72,81,90,99) 
		i = 50;
		int cnt = 0;
		while(i <= 100)
		{
			if(i % 9 == 0)
			{
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		
		
		//����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980
		i = 999;
		while(i >= 100)
		{
			if(i % 28 == 0)
			{
				System.out.println(i);
				break;
			}
			i--;
		}
		
		//����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32
		i = 0;
		cnt = 0;
		while(i <= 100)
		{
			if(i % 8 == 0)
			{
				cnt++;
				if(cnt > 5) {break;}
				else {System.out.print(i + " ");}
			}
			i++;
		}
	}

}
