package arraySentence;

import java.util.Scanner;

public class ArrayController {

	public static void main(String[] args) {
		//����1) �߰� �� �����ϰ� ���� �Է��ϸ� 10 , 20 �ڿ� �����Ѵ�.
		// �ִ� 5������ ����
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) 
		{
			for(int i=0; i<cnt; i++) 
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			
			System.out.println("[1]�߰�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) 
			{
				System.out.print("�߰��� �� �Է� : ");
				int data = scan.nextInt();
				
				arr[cnt] = data;
				cnt++;
			}
			
			if(cnt == arr.length)
			{
				break;
			}
			
		}
		scan.close();
	}

}
