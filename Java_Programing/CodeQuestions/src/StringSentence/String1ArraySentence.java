package StringSentence;

public class String1ArraySentence {

	public static void main(String[] args) {

		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		String temp[] = str.split("/");
		int totalScore = 0;
		
		for(int i = 0; i < temp.length; i++)
		{
			int tempInt = Integer.parseInt(temp[i]);
			arr[i] = tempInt;
			totalScore += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n���� : " + totalScore);
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i = 0; i < scores.length; i++)
		{
			text += scores[i];
			if(i != scores.length - 1) text += "/"; 
		}
		System.out.println(text);
		
	}

}
