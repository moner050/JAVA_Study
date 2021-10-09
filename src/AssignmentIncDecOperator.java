public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		// a, b, c 변수 선언
		int a=3, b=3, c=3;
		// 대입 연산자
		// a=a+3 = 6
		a += 3;
		// b=b*3 = 9
		b *= 3;
		// c=c%2 = 1
		c %= 2; 												
		
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);	// a=6, b=9, c=1
	
		// 변수 d를 3으로 선언
		int d=3;
		
		// 증감 연산자
		// 후위증감 연산자
		a = d++; 												
		System.out.println("a=" + a + ", d=" + d);				// a=3, d=4
		// 전위증감 연산자
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);				// a=5, d=5
		// 후위증감 연산자
		a = d--; 		
		System.out.println("a=" + a + ", d=" + d);				// a=5, d=4
		// 전위증감 연산자
		a = --d; 		
		System.out.println("a=" + a + ", d=" + d);				// d=3, a=3
	}
}
