package classSentence;

import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class ClassSentence2 {

	public static void main(String[] args) {
		
		Ex04 school = new Ex04();
		Scanner scan = new Scanner(System.in);
		
		int[] temp = {87, 11, 92, 14, 47};
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		for(int i = 0; i < school.scores.length; i++)
		{
			school.scores[i] = temp[i];
			System.out.print(school.scores[i] + " ");
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < school.scores.length; i++)
		{
			sum += school.scores[i];
		}
		avg = (double)sum / (double)school.scores.length;
		System.out.printf("\n총점 : (%d) 평균 : (%.1f)\n",sum, avg);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int cnt = 0;
		for(int i = 0; i < school.scores.length; i++)
		{
			if(school.scores[i] >= 60) cnt++;
		}
		System.out.println(cnt + "명");
		

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.print("인덱스 입력 : ");
		int ipIdx = scan.nextInt();
		System.out.printf("성적 : %d점\n",school.scores[ipIdx]);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		int idx = 0;
		System.out.print("성적 입력 : ");
		int ipScore = scan.nextInt();
		for(int i = 0; i < school.scores.length; i++)
		{
			if(ipScore == school.scores[i]) idx = i;
		}
		System.out.println("인덱스 : " + idx);
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점
		idx = 0;
		System.out.print("학번 입력 : ");
		int ipHakbun = scan.nextInt();
		for(int i = 0; i < school.hakbuns.length; i++)
		{
			if(ipHakbun == school.hakbuns[i]) idx = i;
		}
		System.out.println("성적 : " + school.scores[idx]);
		
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		idx = -1;
		System.out.print("학번 입력 : ");
		ipHakbun = scan.nextInt();
		for(int i = 0; i < school.hakbuns.length; i++)
		{
			if(ipHakbun == school.hakbuns[i]) idx = i;
		}
		if(idx == -1) System.out.println("해당 학번은 존재하지 않습니다.");
		else System.out.println("성적 : " + school.scores[idx]);
		
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1003번(92점)
		int maxIdx = 0, maxScore = 0;
		for(int i = 0; i < school.scores.length; i++)
		{
			if(maxScore < school.scores[i]) 
			{
				maxScore = school.scores[i];
				maxIdx = i;
			}
		}
		System.out.println(school.hakbuns[maxIdx] + "번(" + maxScore + ")");
	}

}
