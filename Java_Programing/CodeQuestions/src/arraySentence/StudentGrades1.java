package arraySentence;

import java.util.Random;

public class StudentGrades1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];
		int total = 0;
		double avg = 0.0;
		int cnt = 0;

		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for(int i = 0; i < 5; i++)
		{
			int ranNum = ran.nextInt(100)+1;
			arr[i] = ranNum;
			System.out.print(arr[i] + " ");
			
			if(arr[i] >= 60) {cnt++;}
			total += arr[i];
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		avg = total / (double)arr.length;
		System.out.println("\n총점(" + total +") 평균(" + avg + ")");
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("합격생 수 : " + cnt + "명");
	}

}
