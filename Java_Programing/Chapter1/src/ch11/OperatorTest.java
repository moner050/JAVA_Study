package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		
		// ��ġ������
		// gameScore += 1 �� �ǹ̰� �Ȱ���.
//		int lastScore = ++gameScore;
		
		// ��ġ������
		// lastScore�� gameScore���� �ְ� ���� gameScore�� ���� 1 �����Ѵ�.
		int lastScore = gameScore++;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
