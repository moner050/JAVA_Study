
public class LogicalOperator {

	public static void main(String[] args) {
		
		// 비교 연산
		System.out.println('a' > 'b');					// 'a' = 97, 'b' = 98  false
		System.out.println(3 >= 2);						// 3은 2보다 크거나 같으니   true
		System.out.println(-1 < 0);						// -1은 0보다 작으니 	   true
		System.out.println(3.45 <= 2);					// 3.45는 2보다 작지않으니  false
		System.out.println(3 == 2);						// 3은 2와 같지않으니	   false
		System.out.println(3 != 2);						// 3은 2와 같지 않으니	   true
		System.out.println(!(3 != 2));					// true 의 반대는		   false

		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));			// true AND false :    false
		System.out.println((3 != 2) || (-1 > 0));		// true OR 	false :	   true
		System.out.println((3 != 2) ^ (-1 > 0));		// true XOR false	   true
	}
}
