package ArraySentence;

import java.util.Scanner;

public class StudentGrades2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 인덱스 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };

		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점
		System.out.print("인덱스 입력 : ");
		int ipIdx = scan.nextInt();
		System.out.println("성적 : " + arr[ipIdx]);
		
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		System.out.print("성적 입력 : ");
		int grade = scan.nextInt();
		int idx = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(grade == arr[i]) {idx = i;}
		}
		System.out.println("인덱스 : " + idx);
		
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점
		idx = 0;
		
		System.out.print("학번 입력 : ");
		int ipHakbuns = scan.nextInt();
		
		for(int i = 0; i < hakbuns.length; i++)
		{
			if(hakbuns[i] == ipHakbuns) {idx = i;}
		}
		System.out.println("성적 : " + scores[idx] + "점");
		
		
		scan.close();
	}

}
