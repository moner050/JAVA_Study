package ch04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	// �л��� ������ �����ִ� �޼���
	public void showStudentInfo()
	{
		System.out.println(studentID + "�й� �л��� �̸���" + studentName +"�̰�, �ּҴ� " + address + "�Դϴ�.");
	}
	
	// studentName�� ��������
	public String getStudentName()
	{
		return studentName;
	}
	
	// �л��� �̸��� ����
	public void setStudentName(String name)
	{
		studentName = name;
	}
}
