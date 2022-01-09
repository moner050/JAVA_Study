package ch10;

public class PassWordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PassWordException{
		if(password == null)
		{
			throw new PassWordException("��й�ȣ�� null�� �� �����ϴ�");
		}
		else if(password.length() < 5)
		{
			throw new PassWordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�");
		}
		else if(password.matches("[a-zA-Z]+"))
		{
			throw new PassWordException("��й�ȣ�� ���ڿ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
		else if(password.matches("[a-zA-Z0-9]+"))
		{
			throw new PassWordException("��й�ȣ�� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
	}

	public static void main(String[] args) {

		PassWordTest test = new PassWordTest();
		
		// �н����尡 null���϶�
		String password = null;
		try 
		{
			test.setPassword(password);
			System.out.println("��������1");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// �н����尡 3�����϶�
		password = "abc";
		try 
		{
			test.setPassword(password);
			System.out.println("��������2");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// �н����尡 5���� �̻������� Ư�����ڰ� ������
		password = "abcde";
		try 
		{
			test.setPassword(password);
			System.out.println("��������3");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// �н����尡 5���� �̻��̰� ����� ���������϶�
		password = "abcde123";
		try 
		{
			test.setPassword(password);
			System.out.println("��������4");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
		
		// �н����尡 5���� �̻��̰� ���ڿ� Ư������ ��� ���ԵǾ� ���� ��
		password = "abcde123!";
		try 
		{
			test.setPassword(password);
			System.out.println("��������5");
		} 
		catch (PassWordException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
