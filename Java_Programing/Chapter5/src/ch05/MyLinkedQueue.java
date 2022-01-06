package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue
{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}


public class MyLinkedQueue extends MyLinkedList implements Queue{

	
	MyListNode front;
	MyListNode rear;
	
	
	// 큐 추가하기.
	@Override
	public void enQueue(String data) {
		
		MyListNode newNode;
		// isEmpty()는 MyLinkedList에 구현완료.
		// Queue가 비었으면
		if( isEmpty() )
		{
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else
		{
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added.");
	}

	// 큐 앞부분부터 출력.
	@Override
	public String deQueue() {
		
		if( isEmpty() )
		{
			return null;
		}
		String data = front.getData();
		
		front = front.next;
	
		if(front == null)
		{
			rear = null;
		}
		return data;
	}

	@Override
	public void printQueue() {
		
		printAll();
	}
	
	
}
