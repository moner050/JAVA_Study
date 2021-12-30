package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		// 생성자
		// 그냥 생성하면 기본으로 10개의 배열이 생성된다.
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for(int i = 0;i < library.size(); i++)
		{
			library.get(i).showInfo();
		}
	}

}
