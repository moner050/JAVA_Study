package ch04;

import ch02.MyArray;

public class MyArrayStack {

	// Stack �����غ���
	MyArray arrayStack;
	int top;
	
	// �⺻ ������
	public MyArrayStack()
	{
		top = 0;
		arrayStack = new MyArray();
	}
	
	// Array�� ����� �Ű������� ����
	public MyArrayStack(int size)
	{
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	// �����͸� �ִ°�.
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
	
	// �����͸� ���°�
	public int pop()
	{
		if( isEmpty() )
		{
			System.out.println("Stack is Empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	// ���� �����ִ� ���� ���.
	public int peek()
	{
		if( isEmpty() )
		{
			System.out.println("Stack Is Empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	// ������ ����� ����.
	public int getSize()
	{
		return top;
	}
	
	// �� á�� Ȯ��.
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
	
	// ����ֳ� Ȯ��.
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
