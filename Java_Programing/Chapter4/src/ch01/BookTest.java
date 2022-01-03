package ch01;

class Book
{
	private String title;
	private String author;
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	// 이것을 빼면 가상메모리의 주소값이 출력된다.
	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {

			Book book = new Book("데미안", "헤르만 헤세");
			// toString을 오버라이딩 안하면 주소값, 하면 toString의 리턴값이 출력된다.
			System.out.println(book);
			
			String str = new String("test");
			// 이것은 주소값이 아닌 문자열이 나온다.
			// toString이 이미 오버라이딩 되있기 때문
			System.out.println(str);
			
	}

}
