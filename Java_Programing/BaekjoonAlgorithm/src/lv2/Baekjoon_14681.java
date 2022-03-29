package lv2;

import java.util.Scanner;

public class Baekjoon_14681 {

	public static void main(String[] args) {

//		첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
//		점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		Scanner scan = new Scanner(System.in);
		
		int point = 0;
		int fNum = scan.nextInt();
		int sNum = scan.nextInt();
		
		if(fNum > 0)
		{
			if(sNum > 0) point = 1;
			else point = 4;
		}
		else
		{
			if(sNum > 0) point = 2;
			else point = 3;
		}
		
		System.out.println(point);
		scan.close();
		
	}

}
