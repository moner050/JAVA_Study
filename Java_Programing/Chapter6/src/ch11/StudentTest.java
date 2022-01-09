package ch11;

public class StudentTest {

	public static void main(String[] args) {

		MyLogger myLogger = MyLogger.getLogger();
		
		// �̸��� null���϶�
		String name = null;
		try
		{
			Student student = new Student(name);
		}
		catch(StudentNameFormatException e)
		{
			myLogger.warning(e.getMessage());
		}
		
		// �̸��� �ʹ� �涧
		try
		{
			Student student = new Student("Edward Jon Kim Length Test");
		}
		catch(StudentNameFormatException e)
		{
			myLogger.warning(e.getMessage());
		}
		
		// �̸��� �������϶�
		Student student = new Student("James");
		String good = student.getStudentName();
	}
}
