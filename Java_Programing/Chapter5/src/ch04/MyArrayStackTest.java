package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack(3);
		
		// 스택의 크기가 3이므로 40은 push안되고 Stack is Full 이 출력됌.
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		// 스택의 배열 출력
		stack.printAll();
		
		// 마지막으로 push한것을 출력후 뺌. top element is 30
		System.out.println("top element is " + stack.pop());
		
		// 스택의 배열 출력
		stack.printAll();
		
		// 스택의 사이즈 출력. stack size is 2
		System.out.println("stack size is " + stack.getSize());

	}

}
