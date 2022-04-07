package ch00;

public class SnailProblem {

	public static void main(String[] args) {

		// �����̰� �Ϸ翡 3M�� �ö����� ���߶��� 2M�� �̲����� ��������.
		// �����̰� 10M ������ �ö󰡴µ� �ɸ��� �ϼ��� ���Ͻÿ�.
		
		int day = 0, currentHeight = 0, treeHeight = 10, upHeight = 3, downHeight = 2;
		
		while(true)
		{
			day++;
			
			currentHeight += upHeight;
			
			if(currentHeight >= treeHeight) break;
			
			currentHeight -= downHeight;
		}
		
		System.out.println(day + "�� �ɷȽ��ϴ�.");
		
		
	}

}
