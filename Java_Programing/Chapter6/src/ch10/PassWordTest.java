package ch10;

public class PassWordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PassWordException{
		if(password == null)
		{
			throw new PassWordException("비밀번호는 null일 수 없습니다");
		}
		else if(password.length() < 5)
		{
			throw new PassWordException("비밀번호는 5자 이상이어야 합니다");
		}
		else if(password.matches("[a-zA-Z]+"))
		{
			throw new PassWordException("비밀번호는 숫자와 특수문자를 포함해야 합니다.");
		}
		else if(password.matches("[a-zA-Z0-9]+"))
		{
			throw new PassWordException("비밀번호는 특수문자를 포함해야 합니다.");
		}
	}

	public static void main(String[] args) {

		PassWordTest test = new PassWordTest();
		
		// 패스워드가 null값일때
		String password = null;
		try 
		{
			test.setPassword(password);
			System.out.println("오류없음1");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// 패스워드가 3글자일때
		password = "abc";
		try 
		{
			test.setPassword(password);
			System.out.println("오류없음2");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// 패스워드가 5글자 이상이지만 특수문자가 없을때
		password = "abcde";
		try 
		{
			test.setPassword(password);
			System.out.println("오류없음3");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// 패스워드가 5글자 이상이고 영어와 숫자조합일때
		password = "abcde123";
		try 
		{
			test.setPassword(password);
			System.out.println("오류없음4");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// 패스워드가 5글자 이상이고 숫자와 특수문자 모두 포함되어 있을 때
		password = "abcde123!";
		try 
		{
			test.setPassword(password);
			System.out.println("오류없음5");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
