package classSentence;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}
/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
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
		
		
		System.out.print("\n정오표\t:\t");
		for(int i = 0; i < omr.answer.length; i++)
		{
			System.out.print(chk[i] + " ");
		}
		System.out.println("\n성적 : " + (cnt*20));
		
		
	}

}
