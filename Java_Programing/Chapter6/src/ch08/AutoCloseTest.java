package ch08;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj)
		{	// Exception�� ������ �߻���Ű�� ���� ����
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println("End");
	}

}
