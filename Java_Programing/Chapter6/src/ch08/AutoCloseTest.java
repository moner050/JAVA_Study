package ch08;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj)
		{	// Exception을 강제로 발생시키기 위해 생성
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println("End");
	}

}
