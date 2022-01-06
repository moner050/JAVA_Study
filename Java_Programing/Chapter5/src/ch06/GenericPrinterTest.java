package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// <> : 다이아몬드 연산자
		Powder powder = new Powder();
		// <>에 실제적으로 어떤 자료형을 쓸지 지정.		자동으로 <>에 Powder가 들어감.
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		// 컴파일러에 의해서 GenericPrinter의 T 부분이 다 Powder로 바뀐다.
		// 그래서 형변환을 해줄 필요가 없다.
		Powder p = powderPrinter.getMaterial();
		System.out.println(p.toString());
	}
}
