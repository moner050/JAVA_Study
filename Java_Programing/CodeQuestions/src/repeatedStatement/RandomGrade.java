package repeatedStatement;

import java.util.Random;

public class RandomGrade {
	/*
	 * # 랜덤학생
	 * 1. 10회 반복을 한다.
	 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
	 * 3. 성적이 60점 이상이면 합격생이다.
	 * ---------------------------------------
	 * . 전교생(10명)의 총점과 평균을 출력한다.
	 * . 합격자 수를 출력한다.
	 * . 1등 학생의 번호와 성적을 출력한다.
	*/
	public static void main(String[] args) {

		Random ran = new Random();
		
		int accepted = 0;
		int totalScore = 0;
		double average = 0.0;
		
		int maxScore = 0;
		int maxNum = 0;
		
		int i = 1;
		while(i <= 10)
		{
			int score = ran.nextInt(100) + 1;
			totalScore += score;
			if(score >= 60)
			{
				accepted++;
			}

			if(maxScore < score)
			{
				maxScore = score;
				maxNum = i;
			}
			i++;
		}
		
		average = totalScore / 10.0;
		System.out.println("전교생 총점 : " + totalScore + ", 평균점수 : " + average);
		System.out.println("합격자수 : " + accepted);
		System.out.println("1등 학생 번호 : " + maxNum + "번, 1등 학생 점수 : " + maxScore + "점");
		
	}

}
