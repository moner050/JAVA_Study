package arraySentence;
import java.util.Scanner;

public class NumberMoveLV1 {
	/*
	 * # �����̵�[1�ܰ�]
	 * 1. ����2�� ĳ�����̴�.
	 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
	 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
	 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
	 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> ���� ==> {0, 2, 0, 0, 0, 0, 0};
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] game = {2, 0, 0, 0, 0, 0, 0};
		
		int player = -1;
		for(int i=0; i<7; i++) 
		{
			if(game[i] == 2) {player = i;}
		}
		
		System.out.println("1.����  2.������");
		int direction = scan.nextInt();
		
		if((direction == 1 && player == 0) || (direction == 2 && player == 6))
		{
			System.out.println("���� �������δ� �� �� �����ϴ�.");
		}
		else
		{
			game[player] = 0;
			if(direction == 1)
			{
				game[player - 1] = 2; 
			}
			
			if(direction == 2)
			{
				game[player + 1] = 2;
			}
		}
		
		for(int i = 0; i < game.length; i++)
		{
			System.out.print(game[i] + " ");
		}
		scan.close();
	}

}
