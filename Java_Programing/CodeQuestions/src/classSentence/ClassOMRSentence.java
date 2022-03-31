package classSentence;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// ������
	int[] hgd = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
}
/*
 * # OMRī�� : Ŭ���� + ����
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

public class ClassOMRSentence {

	public static void main(String[] args) {

		Random ran = new Random();
		Ex06 omr = new Ex06();
		String chk[] = new String[5];
		
		int cnt = 0;
		
		for(int i = 0; i < omr.answer.length; i++)
		{
			omr.hgd[i] = ran.nextInt(5)+1;
		}
		
		for(int i = 0; i < omr.answer.length; i++)
		{
			if(omr.answer[i] == omr.hgd[i])
			{
				cnt++;
				chk[i] = "O";
			}
			else chk[i] = "X";
		}
		
		System.out.print("answer\t:\t");
		for(int i = 0; i < omr.answer.length; i++)
		{
			System.out.print(omr.answer[i] + " ");
		}
		
		System.out.print("\nhgd\t:\t");
		for(int i = 0; i < omr.answer.length; i++)
		{
			System.out.print(omr.hgd[i] + " ");
		}
		
		
		System.out.print("\n����ǥ\t:\t");
		for(int i = 0; i < omr.answer.length; i++)
		{
			System.out.print(chk[i] + " ");
		}
		System.out.println("\n���� : " + (cnt*20));
		
		
	}

}
