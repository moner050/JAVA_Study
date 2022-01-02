package ch09;

public abstract class NoteBook extends Computer{

	// 하나만 구현하고 추상화 시켜줘도 된다.
	@Override
	public void display() {
		System.out.println("NoteBook display");
	}
	


}
