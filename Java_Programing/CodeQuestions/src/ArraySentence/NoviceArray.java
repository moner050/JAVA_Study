package ArraySentence;

public class NoviceArray {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		for(int i = 1; i <= 5; i++)
		{
			arr[i-1] = i * 10;
			System.out.print(arr[i-1] + " ");
		}

		// ����2) ��ü �� ���
		// ����2) 150
		int total = 0;
		for(int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		System.out.println("\n" + total);
		

		// ����1) 4�� ����� ���
		// ����1) 20 40
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 4 == 0) 
			{
				System.out.print(arr[i] + " ");	
			}
		}

		// ����2) 4�� ����� �� ���
		// ����2) 60
		total = 0;
		for(int i = 0; i < 5; i++)
		{
			if(arr[i] % 4 == 0) 
			{
				total += arr[i];
			}
		}
		System.out.println("\n" + total);

		// ����3) 4�� ����� ���� ���
		// ����3) 2
		int cnt = 0;
		for(int i = 0; i < 5; i++)
		{
			if(arr[i] % 4 == 0) 
			{
				cnt++;
			}
		}
		System.out.println(cnt);

		
	}

}
