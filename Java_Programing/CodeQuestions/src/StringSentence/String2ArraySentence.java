package StringSentence;

public class String2ArraySentence {

	public static void main(String[] args) {

		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
			
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		String temp[] = str.split(",");
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		for(int i = 0; i < temp.length; i++)
		{
			String strTemp[] = temp[i].split("/");
			
			name[i] = strTemp[0];
			score[i] = Integer.parseInt(strTemp[1]);
		}
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(name[i] + " ");
			System.out.println(score[i] + " ");
		}
			
			
			
	}

}
