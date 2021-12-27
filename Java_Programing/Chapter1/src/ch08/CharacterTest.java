package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		// 변수뒤에 숫자를 쓰는 것은 좋은 코딩방법은 아니다.
		char ch1 = 'A';
		System.out.println(ch1);
		// 자료형 ch1을 강제로 문자형으로 강제형변환 후 출력
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		// 숫자를 써도 char로 선언되있기 때문에 강제 형변환을 하기 전과 후는 똑같다.
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		// int형인 ch3를 char형으로 강제형변환 후 출력
		System.out.println((char)ch3);
		
		// 유니코드를 선언할려면 \\u를 앞에 쓰면된다. 
		char han = '한';
		char ch = '\uD55C';
		
		System.out.println(han);
		System.out.println(ch);
	}
}
