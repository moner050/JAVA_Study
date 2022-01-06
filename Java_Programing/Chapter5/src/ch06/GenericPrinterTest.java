package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// <> : ���̾Ƹ�� ������
		Powder powder = new Powder();
		// <>�� ���������� � �ڷ����� ���� ����.		�ڵ����� <>�� Powder�� ��.
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		// �����Ϸ��� ���ؼ� GenericPrinter�� T �κ��� �� Powder�� �ٲ��.
		// �׷��� ����ȯ�� ���� �ʿ䰡 ����.
		Powder p = powderPrinter.getMaterial();
		System.out.println(p.toString());
	}
}
