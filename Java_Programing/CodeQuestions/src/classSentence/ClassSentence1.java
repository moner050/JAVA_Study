package classSentence;

class Ex03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class ClassSentence1 {

	public static void main(String[] args) {

		Ex03 num = new Ex03();
		
		int sum = 0;
		int cnt = 0;
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		for(int i = 0; i < num.arr.length; i++)
		{
			sum += num.arr[i];
		}
		System.out.println(sum);
		
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		sum = 0;
		for(int i = 0; i < num.arr.length; i++)
		{
			if(num.arr[i] % 4 == 0) sum += num.arr[i];
		}
		System.out.println(sum);

		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		for(int i = 0; i < num.arr.length; i++)
		{
			if(num.arr[i] % 4 == 0) cnt++;
		}
		System.out.println(cnt);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		cnt = 0;
		for(int i = 0; i < num.arr.length; i++)
		{
			if(num.arr[i] % 2 == 0) cnt++;
		}
		System.out.println(cnt);

	}

}
