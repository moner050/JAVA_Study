package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// <> : 다이아몬드 연산자
		Powder powder = new Powder();
		// <>에 실제적으로 어떤 자료형을 쓸지 지정.		자동으로 <>에 Powder가 들어감.
		// <>안에 들어갈 자료형이 Material을 상속받아야만 사용 가능하다.
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		// 컴파일러에 의해서 GenericPrinter의 T 부분이 다 Powder로 바뀐다.
		// 그래서 형변환을 해줄 필요가 없다.
		Powder p = powderPrinter.getMaterial();
		System.out.println(p.toString());
		
		// 제너릭을 안 쓸수 있지만 형변환을 해줘야 한다.
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Plastic());
		Plastic plastic = (Plastic)powderPrinter2.getMaterial();
		
		System.out.println(plastic);
		
		// Water은 Material을 상속을 받지 않았기 때문에 오류.
		// GenericPrinter<Water> printer = new GenericPrinter<Water>();
	}
}
