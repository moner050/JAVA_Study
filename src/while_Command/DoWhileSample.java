package while_Command;

public class DoWhileSample {

	public static void main(String[] args) {
		// ���������� c ����.
		char c = 'a';
		
		// ���� c �� 'z'�� ������ �۰ų� ���������� �ݺ�.
		do 
		{
			System.out.print(c);
			c = (char) (c + 1);
		} 
		while (c <= 'z'); 	
	}
}
	