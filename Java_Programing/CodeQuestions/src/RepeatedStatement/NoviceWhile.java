package RepeatedStatement;

public class NoviceWhile {

	public static void main(String[] args) {

		// ����1) 1~5������ �� ���
		// ���� 1) 15
		int i = 1;
		int plus = 0;
		while(i <= 5)
		{
			plus += i;
			i++;
		}
		System.out.println(plus);

		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		i = 1;
		while(i <= 10)
		{
			if(i < 3 || i >= 7 && i != 10) {System.out.print(i + ", ");}
			if(i == 10) {System.out.println(i);}
			i++;
		}
		
		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		plus = 0;
		i = 1;
		while(i <= 10)
		{
			if(i < 3 || i >= 7) {plus += i;}
			i++;
		}
		System.out.println(plus);
		
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		int cnt = 0;
		i = 1;
		while(i <= 10)
		{
			if(i < 3 || i >= 7) {cnt++;}
			i++;
		}
		System.out.println(cnt);
	}

}
