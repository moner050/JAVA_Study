package lv2;

import java.util.Scanner;

public class Baekjoon_2753 {

	public static void main(String[] args) {

//		ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
//		ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.		
		
		Scanner scan = new Scanner(System.in);
		
		int chk = 0;
		
		int year = scan.nextInt();
		
		// ((������ 4�� ����̸鼭, 100�� ����� �ƴ� ��) �Ǵ� (400�� ����� ��))
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) chk = 1;
		else chk = -1;
		
		if(chk == 1) System.out.println("1");
		else System.out.println("0");
		
		scan.close();
	}

}

