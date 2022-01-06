package ch05;

public class MyListQueueTest {
	
	public static void main(String[] args)
	{
		 MyLinkedQueue listQueue = new MyLinkedQueue();
		 // Queue�� "A", "B", "C" ����ֱ�.
		 listQueue.enQueue("A");
		 listQueue.enQueue("B");
		 listQueue.enQueue("C");
		 
		 // Queue ��ü ���	A->B->C
		 listQueue.printAll();
		 
		 // Queue ���� ���ͺ��� ��������.
		 // A
		 System.out.println(listQueue.deQueue());
		 // B
		 System.out.println(listQueue.deQueue());
		 
		 // Queue�� "R"�� �߰��ϱ�.
		 listQueue.enQueue("R");
		 
		 // Queue ��ü ���	A->B->C->R
		 listQueue.printAll();
		 // C
		 System.out.println(listQueue.deQueue());
		 // D
		 System.out.println(listQueue.deQueue());

	}

}
