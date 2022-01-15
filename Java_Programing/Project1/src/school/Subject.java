package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {

	// 과목이름, 과목 고유번호, 과목 채점방식
	private String subjectName;
	private int subjectId;
	private int gradeType;
	
	// 수강신청한 학생 리스트
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String subjectName, int subjectId)
	{
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		// 기본적으로 AB_TYPE을 줌
		this.gradeType = Define.AB_TYPE;
	}

	// studentList에 학생 추가.
	public void register(Student student)
	{
		studentList.add(student);
	}
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
}
