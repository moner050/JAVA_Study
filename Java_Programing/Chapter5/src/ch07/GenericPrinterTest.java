package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// <> : ���̾Ƹ�� ������
		Powder powder = new Powder();
		// <>�� ���������� � �ڷ����� ���� ����.		�ڵ����� <>�� Powder�� ��.
		// <>�ȿ� �� �ڷ����� Material�� ��ӹ޾ƾ߸� ��� �����ϴ�.
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		// �����Ϸ��� ���ؼ� GenericPrinter�� T �κ��� �� Powder�� �ٲ��.
		// �׷��� ����ȯ�� ���� �ʿ䰡 ����.
		Powder p = powderPrinter.getMaterial();
		System.out.println(p.toString());
		
		// ���ʸ��� �� ���� ������ ����ȯ�� ����� �Ѵ�.
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Plastic());
		Plastic plastic = (Plastic)powderPrinter2.getMaterial();
		
		System.out.println(plastic);
		
		// Water�� Material�� ����� ���� �ʾұ� ������ ����.
		// GenericPrinter<Water> printer = new GenericPrinter<Water>();
	}
}
