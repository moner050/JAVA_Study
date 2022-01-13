package ch23;

import java.util.ArrayList;

class FastLibrary
{
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibrary()
	{
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
	}
	
	public synchronized String lendBook() throws InterruptedException
	{
		Thread t = Thread.currentThread();
		
		// 배열에 값이 없으면 기다려라.
		while( shelf.size() == 0 )
		{
			System.out.println(t.getName() + " wating start");
			wait();
			System.out.println(t.getName() + " wating end");
		}
			// 리스트에 있는 첫번째 책을 삭제 후 book에 값 넣어줌.
		if( shelf.size() > 0)
		{
			String book = shelf.remove(0);
			System.out.println(t.getName() + " " + book + " lend");
			return book;
		}
		else return null;
		
	}
	
	public synchronized void returnBook(String book)
	{
		Thread t = Thread.currentThread();
		// 리스트에 매개변수로 받은 책을 넣어준다.
		shelf.add(book);
		// 책을 반납했으니 notify()/notifyAll()를 호출하여 wait() 상태인 Thread/모든Thread 재시작
		notifyAll();
		System.out.println(t.getName() + " " + book + " return");
	}
}

class Student extends Thread
{
	public Student(String name)
	{
		super(name);
	}
	
	public void run()
	{
		try
		{
			String title = LibraryMain.library.lendBook();
			if( title == null) 
			{
				System.out.println(getName() + "빌리지 못했습니다.");
				return;
			}
			sleep(5000);		
			LibraryMain.library.returnBook(title);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}

public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) 
	{
		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");
		Student std5 = new Student("std5");
		Student std6 = new Student("std6");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}
}
