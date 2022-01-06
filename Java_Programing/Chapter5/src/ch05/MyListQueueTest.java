package ch05;

public class MyListQueueTest {
	
	public static void main(String[] args)
	{
		 MyLinkedQueue listQueue = new MyLinkedQueue();
		 // Queue에 "A", "B", "C" 집어넣기.
		 listQueue.enQueue("A");
		 listQueue.enQueue("B");
		 listQueue.enQueue("C");
		 
		 // Queue 전체 출력	A->B->C
		 listQueue.printAll();
		 
		 // Queue 먼저 들어간것부터 꺼내오기.
		 // A
		 System.out.println(listQueue.deQueue());
		 // B
		 System.out.println(listQueue.deQueue());
		 
		 // Queue에 "R"을 추가하기.
		 listQueue.enQueue("R");
		 
		 // Queue 전체 출력	A->B->C->R
		 listQueue.printAll();
		 // C
		 System.out.println(listQueue.deQueue());
		 // D
		 System.out.println(listQueue.deQueue());

	}

}
