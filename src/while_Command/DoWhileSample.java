package while_Command;

public class DoWhileSample {

	public static void main(String[] args) {
		// 문자형변수 c 선언.
		char c = 'a';
		
		// 변수 c 가 'z'의 값보다 작거나 같을때까지 반복.
		do 
		{
			System.out.print(c);
			c = (char) (c + 1);
		} 
		while (c <= 'z'); 	
	}
}
	