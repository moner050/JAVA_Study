package ch11;

public class StudentTest {

	public static void main(String[] args) {

		MyLogger myLogger = MyLogger.getLogger();
		
		// 이름이 null값일때
		String name = null;
		try
		{
			Student student = new Student(name);
		}
		catch(StudentNameFormatException e)
		{
			myLogger.warning(e.getMessage());
		}
		
		// 이름이 너무 길때
		try
		{
			Student student = new Student("Edward Jon Kim Length Test");
		}
		catch(StudentNameFormatException e)
		{
			myLogger.warning(e.getMessage());
		}
		
		// 이름이 정상적일때
		Student student = new Student("James");
		String good = student.getStudentName();
	}
}
