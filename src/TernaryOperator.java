public class TernaryOperator {

	public static void main(String[] args) {
		// 변수 a, b를 선언
		int a = 3, b = 5;

		// a>b 가 true이면 (a-b)실행. false면 (b-a) 실행
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
	}
}
