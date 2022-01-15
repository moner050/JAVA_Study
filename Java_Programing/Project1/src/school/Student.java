package school;

import java.util.ArrayList;

public class Student {

	// 학번, 이름, 중점과목
	private int studentId;
	private String studentName;
	private Subject majorSubject;
	
	// 학생 성적 리스트
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int studentId, String studentName, Subject majorSubject)
	{
		this.studentId = studentId;
		this.studentName = studentName;	
		this.majorSubject = majorSubject;
	}

	// scoreList에 점수가 추가됌
	public void addSubjectScore(Score score)
	{
		scoreList.add(score);
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
	
}
