package StringSentence;

public class StringTwoArraySentence {

	public static void main(String[] args) {

		String [][] student = {
				{"aaa","����","1001"}, 
				{"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} , 
				{"ddd" , "����","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		
		//�л� ������ ������ ��� ������ �̴� 
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴� 
		//����1) ��ü ������ 1���� �л� �̸� ��� 
		int max = 0;
		int idx = 0;
		
		for(int i = 0; i < score.length; i++)
		{
			int sum = 0;
			for(int j = 1; j < score[i].length; j++)
			{
				sum += Integer.parseInt(score[i][j]);
			}
			if(sum > max) 
			{
				max = sum;
				idx = i;
			}
		}
		
		System.out.println("������ 1���� �л��� id : " + student[idx][0]);
		System.out.println("������ 1���� �л��� �ּ� : " + student[idx][1]);
		System.out.println("������ 1���� �л��� ��ȣ : " + student[idx][2]);
	}

}
