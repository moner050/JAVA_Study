package ch08;

public class ObjectTest01 {
    public static void main(String[] args) {
        // Student 타입의 객체만 저장
        Student[] studentList = new Student[2];
        studentList[0] = new Student("김둘리", 83);
        studentList[1] = new Student("박또치", 68);

        // 모든 타입의 객체 저장(묵시적 타입 변환)
        Object[] objectList = new Object[2];
        objectList[0] = new Student("김둘리", 83);
        objectList[1] = new String("박또치의 점수 : 68");
    }
}
