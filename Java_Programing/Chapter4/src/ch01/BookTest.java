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
	
	// �̰��� ���� ����޸��� �ּҰ��� ��µȴ�.
	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {

			Book book = new Book("���̾�", "�츣�� �켼");
			// toString�� �������̵� ���ϸ� �ּҰ�, �ϸ� toString�� ���ϰ��� ��µȴ�.
			System.out.println(book);
			
			String str = new String("test");
			// �̰��� �ּҰ��� �ƴ� ���ڿ��� ���´�.
			// toString�� �̹� �������̵� ���ֱ� ����
			System.out.println(str);
			
	}

}
