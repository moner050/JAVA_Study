package ch03;

public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		// 3번 인덱스에 D를 삽입
		list.insertElement(3, "D");
		list.printAll();
		// 0번 인덱스 삭제
		list.removeElement(0);
		list.printAll();
		// 1번 인덱스 삭제
		list.removeElement(1);
		list.printAll();
						
		// 0번 인덱스에 A-1을 삽입
		list.insertElement(0, "A-1");
		list.printAll();
		// list 의 사이즈 출력
		System.out.println(list.getSize());
		
		// 0번 인덱스 삭제
		list.removeElement(0);
		list.printAll();
		// list 의 사이즈 출력
		System.out.println(list.getSize());
		
		// 모든 인덱스의 값 삭제
		list.removeAll();
		list.printAll();
		// A를 추가
		list.addElement("A");
		list.printAll();
		System.out.println(list.getElement(0));
		// 0번 인덱스 삭제
		list.removeElement(0);
		list.printAll();

		
		
		
	}

}
