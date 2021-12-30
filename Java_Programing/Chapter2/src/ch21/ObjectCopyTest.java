package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		// 객체 배열 선언 및 초기화
		Book[] library = new Book[5];
		// 복사할 배열 선언
		Book[] copyLibrary = new Book[5];
		
//		for(int i = 0; i < library.length; i++)
//		{
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < copyLibrary.length; i++)
		{
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		// arraycopy 를 이용하여 배열을 복사하면 메모리주소도 똑같이 복사된다.
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("=== library ===");
		for(Book book : library)
		{
			System.out.println(book);
			book.showInfo();
		}
		System.out.println("=== Copy library ===");
		for(Book book : copyLibrary)
		{
			System.out.println(book);
			book.showInfo();
		}
		
		// 배열을 복사하면 메모리주소도 똑같이 복사되는지 테스트
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("=== Copy library ===");
		for(Book book : copyLibrary)
		{
			System.out.println(book);
			book.showInfo();
		}
	}
}
