package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException{

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		// 다른객체이기 때문에 false가 나온다.
		System.out.println(std1 == std2);
		// 주소값이 다르기때문에 
		System.out.println(std1.equals(std2));
	
		// 메모리값 출력
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// static함수 사용
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		
	}
	

}
