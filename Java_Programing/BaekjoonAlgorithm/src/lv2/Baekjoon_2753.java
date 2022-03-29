package lv2;

import java.util.Scanner;

public class Baekjoon_2753 {

	public static void main(String[] args) {

//		첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//		첫째 줄에 윤년이면 1, 아니면 0을 출력한다.		
		
		Scanner scan = new Scanner(System.in);
		
		int chk = 0;
		
		int year = scan.nextInt();
		
		// ((연도가 4의 배수이면서, 100의 배수가 아닐 때) 또는 (400의 배수일 때))
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) chk = 1;
		else chk = -1;
		
		if(chk == 1) System.out.println("1");
		else System.out.println("0");
		
		scan.close();
	}

}

