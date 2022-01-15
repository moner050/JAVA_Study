package report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {

	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = "  이름  |  학번  |중점과목|  점수    \n";
	public static final String LINE = "-----------------------------------------\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport()
	{
		// 모든 과목에 대한 학점 산출
		ArrayList<Subject> subjectList = school.getSubjectList();
		for( Subject subject : subjectList)
		{
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}
	
	// 헤더부분 생성
	public void makeHeader(Subject subject)
	{
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	// 바디부분 생성
	public void makeBody(Subject subject)
	{
		// 각 과목의 학생 리스트 studentList에 넣어주기
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student student = studentList.get(i);
			
			buffer.append(" ");
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append("| ");
			
			// 학생별 해당과목 학점 계산
			getScoreGrade(student, subject);
			
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	// 푸터부분 생성
	public void makeFooter()
	{
		buffer.append("\n");
	}
	
	
	public void getScoreGrade(Student student, Subject subject)
	{
		// scoreList에 학생 점수 리스트 넣어주기
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};
		
		// 학생들이 가진 점수들
		for(int i = 0; i < scoreList.size(); i++)
		{
			Score score  = scoreList.get(i);
			// 만약 현재 학점을 산출할 과목이면
			if(score.getSubject().getSubjectId() == subject.getSubjectId())
			{
				String grade;
				
				if(score.getSubject().getGradeType() == Define.PF_TYPE)
				{
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
				}
				else
				{
				
					if(score.getSubject().getSubjectId() == majorId)
					{	// 중점과목이면 학점 평가방법을 SAB타입으롭 바꾼다
						grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
					}
					else
					{	// 중점과목이 아니면 학점 평가방법을 AB타입으로 바꾼다
						grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
					}
				}
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
		
	}
}

