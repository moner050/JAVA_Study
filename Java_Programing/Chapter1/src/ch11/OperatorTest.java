package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		
		// 전치연산자
		// gameScore += 1 과 의미가 똑같다.
//		int lastScore = ++gameScore;
		
		// 후치연산자
		// lastScore에 gameScore값을 넣고 나서 gameScore의 값을 1 증가한다.
		int lastScore = gameScore++;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
