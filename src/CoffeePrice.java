import java.util.Scanner;
public class CoffeePrice {

	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		
		// scan ��ü�� �̿��� �޴� �Է¹ޱ�.
		System.out.print("���� Ŀ�� �帱���? : ");
		String order = scan.next();
		
		int price = 0;
		
		switch (order) 
		{
			case "����������":
			case "īǪġ��":
			case "ī���":
				price = 3500;
				break;
			case "�Ƹ޸�ī��" :
				price = 2000;
				break;
			default:
				System.out.println("�޴��� �����ϴ�!");
		}
		
		// ���� price�� 0���� �ƴ϶�� �޴��� ���� ���.
		if(price != 0)
		{
			System.out.print(order + "�� " + price + "���Դϴ�");
		}
		
		// ��ĳ�� ����
		scan.close();
	}
}
