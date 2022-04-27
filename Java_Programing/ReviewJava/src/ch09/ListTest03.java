package ch09;

import java.util.ArrayList;
import java.util.List;

public class ListTest03 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Student kim = new Student("STD-000001", "김둘리", 83, "컴퓨터 공학");
        studentList.add(kim);
        studentList.add(new Student("STD-000002", "박또치", 100, "컴퓨터 공학"));
        studentList.add(new Student("STD-000003", "도우너", 75, "기계 공학"));
        studentList.add(new Student("STD-000004", "마이콜", 49, "산업 공학"));
        studentList.add(new Student("STD-000004", "마이콜", 49, "산업 공학"));

        System.out.println("[ 학생 목록 ]");
        for (Student student : studentList)
        {
            System.out.println(student.toString());
        }
    }
}
