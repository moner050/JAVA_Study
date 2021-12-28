package ch04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	// 학생의 정보를 보여주는 메서드
	public void showStudentInfo()
	{
		System.out.println(studentID + "학번 학생의 이름은" + studentName +"이고, 주소는 " + address + "입니다.");
	}
	
	// studentName을 가져오기
	public String getStudentName()
	{
		return studentName;
	}
	
	// 학생의 이름을 지정
	public void setStudentName(String name)
	{
		studentName = name;
	}
}
