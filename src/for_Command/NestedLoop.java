package for_Command;

public class NestedLoop {

	public static void main(String[] args) {
		
		// 1�ܿ��� 9��
		for(int i=1; i<10; i++) 
		{ 
			for(int j=1; j<10; j++) 
			{ // �� ���� ������ ���
				System.out.print(i + "X" + j + "=" + i*j); // ������ ���
				System.out.print('\t'); // �ϳ��� ������ ���
			}
			 // �� ���� ������ ���� �ٷ� Ŀ�� �̵�
			System.out.println();
		}
	}
}
