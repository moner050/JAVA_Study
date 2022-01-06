package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack(3);
		
		// ������ ũ�Ⱑ 3�̹Ƿ� 40�� push�ȵǰ� Stack is Full �� ���.
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		// ������ �迭 ���
		stack.printAll();
		
		// ���������� push�Ѱ��� ����� ��. top element is 30
		System.out.println("top element is " + stack.pop());
		
		// ������ �迭 ���
		stack.printAll();
		
		// ������ ������ ���. stack size is 2
		System.out.println("stack size is " + stack.getSize());

	}

}
