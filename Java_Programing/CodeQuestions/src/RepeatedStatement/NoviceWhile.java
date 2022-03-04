package RepeatedStatement;

public class NoviceWhile {

	public static void main(String[] args) {

		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int i = 1;
		int plus = 0;
		while(i <= 5)
		{
			plus += i;
			i++;
		}
		System.out.println(plus);

		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		i = 1;
		while(i <= 10)
		{
			if(i < 3 || i >= 7 && i != 10) {System.out.print(i + ", ");}
			if(i == 10) {System.out.println(i);}
			i++;
		}
		
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		plus = 0;
		i = 1;
		while(i <= 10)
		{
			if(i < 3 || i >= 7) {plus += i;}
			i++;
		}
		System.out.println(plus);
		
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		int cnt = 0;
		i = 1;
		while(i <= 10)
		{
			if(i < 3 || i >= 7) {cnt++;}
			i++;
		}
		System.out.println(cnt);
	}

}
