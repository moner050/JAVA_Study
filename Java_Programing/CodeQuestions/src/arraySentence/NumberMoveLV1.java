package arraySentence;
import java.util.Scanner;

public class NumberMoveLV1 {
	/*
	 * # 숫자이동[1단계]
	 * 1. 숫자2는 캐릭터이다.
	 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
	 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
	 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
	 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> 왼쪽 ==> {0, 2, 0, 0, 0, 0, 0};
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
		
		System.out.println("1.왼쪽  2.오른쪽");
		int direction = scan.nextInt();
		
		if((direction == 1 && player == 0) || (direction == 2 && player == 6))
		{
			System.out.println("그쪽 방향으로는 갈 수 없습니다.");
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
