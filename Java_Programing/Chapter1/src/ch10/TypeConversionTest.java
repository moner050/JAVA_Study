package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		int iNum = 255;
		byte bNum = (byte) iNum;
		
		// 127밖에 표현 안되는 byte형에 255를 넣으면 이상한 값이 출력된다.
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		// 실수형인 dNum을 강제로 정수형으로 변환하면 소수점부분을 유실한채 변환된다.
		System.out.println(inum);
		
		dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum;
		System.out.println(myNum);
		
	}
}
