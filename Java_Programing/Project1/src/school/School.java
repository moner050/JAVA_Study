package school;

import java.util.ArrayList;

public class School {

	// 싱글톤 패턴
	private static School instance = new School();
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School() {}
	
	public static School getInstance()
	{
		if(instance == null)
		{
			instance = new School();
		}
		return instance;
	}
	
	// 학생 등록
	public void addStudent(Student student)
	{
		studentList.add(student);
	}
	
	// 과목 등록
	public void addSubject(Subject subject)
	{
		subjectList.add(subject);
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public static void setInstance(School instance) {
		School.instance = instance;
	}
	
	
}
