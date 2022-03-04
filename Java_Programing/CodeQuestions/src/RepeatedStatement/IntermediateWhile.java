package RepeatedStatement;

public class IntermediateWhile {

	public static void main(String[] args) {

		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		int i = 0;
		while(i <= 300)
		{
			if(i % 9 == 0 && i % 10 == 6)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		i = 0;
		while(i <= 300)
		{
			if(i % 9 == 0 && i / 10 == 6)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
		i = 300;
		while(i >= 0)
		{
			if(i % 8 == 0 && i < 150)
			{
				System.out.println(i);
				break;
			}
			i--;
		}
		
		//문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력  # 답 : 6 (54,63,72,81,90,99) 
		i = 50;
		int cnt = 0;
		while(i <= 100)
		{
			if(i % 9 == 0)
			{
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		
		
		//문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		i = 999;
		while(i >= 100)
		{
			if(i % 28 == 0)
			{
				System.out.println(i);
				break;
			}
			i--;
		}
		
		//문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		i = 0;
		cnt = 0;
		while(i <= 100)
		{
			if(i % 8 == 0)
			{
				cnt++;
				if(cnt > 5) {break;}
				else {System.out.print(i + " ");}
			}
			i++;
		}
	}

}
