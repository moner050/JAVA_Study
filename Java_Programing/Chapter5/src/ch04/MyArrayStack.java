package ch04;

import ch02.MyArray;

public class MyArrayStack {

	// Stack 구현해보기
	MyArray arrayStack;
	int top;
	
	// 기본 생성자
	public MyArrayStack()
	{
		top = 0;
		arrayStack = new MyArray();
	}
	
	// Array의 사이즈를 매개변수로 받음
	public MyArrayStack(int size)
	{
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	// 데이터를 넣는것.
	public void push(int data)
	{
		if( isFull() )
		{
			System.out.println("Stack is Full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	
	// 데이터를 빼는것
	public int pop()
	{
		if( isEmpty() )
		{
			System.out.println("Stack is Empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	// 현제 남아있는 스택 출력.
	public int peek()
	{
		if( isEmpty() )
		{
			System.out.println("Stack Is Empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	// 스택의 사이즈를 리턴.
	public int getSize()
	{
		return top;
	}
	
	// 꽉 찼나 확인.
	public boolean isFull()
	{
		if( top == arrayStack.ARRAY_SIZE )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// 비어있나 확인.
	public boolean isEmpty()
	{
		if( top == 0 )
		{
			System.out.println("Stack is Empty");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void printAll()
	{
		arrayStack.printAll();
	}
	
}
