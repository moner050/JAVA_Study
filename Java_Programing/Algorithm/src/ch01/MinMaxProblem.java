package ch01;

public class MinMaxProblem {

	public static void main(String[] args) {

		// �迭�� �ִ밪�� �ּڰ��� ã�� �� ��ġ�� ���� ����ϱ�.
		
		int numbers[] = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = numbers[0], max = numbers[0];
		int minIdx = 0, maxIdx = 0;
		
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] < min)
			{
				min = numbers[i];
				minIdx = i + 1;
			}
			
			if(numbers[i] > max)
			{
				max = numbers[i];
				maxIdx = i + 1;
			}
		}
		
		System.out.println("���� ū ���� " + max + "�̰� �� ��ġ�� " + maxIdx + "��° �̴�.");
		System.out.println("���� ���� ���� " + min + "�̰� �� ��ġ�� " + minIdx + "��° �̴�.");
	}

}
