package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args)
	{
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		
		// 반환값이 Object이기 때문에 (Powder)를 써줘서 형변환을 해줘야 함.
		Powder p = (Powder)printer.getMaterial();
	}
	
}
