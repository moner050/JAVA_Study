package ch10;

public class PassWordException extends Exception{

	public PassWordException(String message)
	{	// message의 get이 상위 클래스에서 이루어질 수 있기 때문에 super사용
		super(message);
	}
}
