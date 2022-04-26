package ch06.polymorphism02;

public class AbstractTest01 {
    public static void main(String[] args) {
        Student kim = new UniversityStudent("김유신", 88);
        kim.examTake();
        kim.examSolve();
        kim.examSubmit();
    }
}
