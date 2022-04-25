package ch05.inheritance03;

public class Student {

    String name;

    Student()
    {
        System.out.println("===> Student() 생성자 호출");
    }

    Student(String name)
    {
        System.out.println("===> Student(String name) 생성자 호출");
        this.name = name;
    }

    String printInfo() {
        return "학생 이름 : " + name;
    }
}
