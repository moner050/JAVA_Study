package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		// �׳� �����ϸ� �迭�� �ڵ����� 0���� �ʱ�ȭ �ȴ�.
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++)
		{
			arr[i] = num++;
		}
		
		// ���� for��
		// num�� arr�迭�� ��簪�� �ϳ��� ���������� ����.
		for( int num : arr )
		{
			total += num;
		}
		
		System.out.println(total);
	}

}
