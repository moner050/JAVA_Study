package ch03;

public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		// 3�� �ε����� D�� ����
		list.insertElement(3, "D");
		list.printAll();
		// 0�� �ε��� ����
		list.removeElement(0);
		list.printAll();
		// 1�� �ε��� ����
		list.removeElement(1);
		list.printAll();
						
		// 0�� �ε����� A-1�� ����
		list.insertElement(0, "A-1");
		list.printAll();
		// list �� ������ ���
		System.out.println(list.getSize());
		
		// 0�� �ε��� ����
		list.removeElement(0);
		list.printAll();
		// list �� ������ ���
		System.out.println(list.getSize());
		
		// ��� �ε����� �� ����
		list.removeAll();
		list.printAll();
		// A�� �߰�
		list.addElement("A");
		list.printAll();
		System.out.println(list.getElement(0));
		// 0�� �ε��� ����
		list.removeElement(0);
		list.printAll();

		
		
		
	}

}
